package home

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.types.{DoubleType, IntegerType, Metadata, StringType, StructField, StructType}

class Transformer(val input: String, val output1: String, val output2: String) {
    def process(spark: SparkSession): Unit = {
        val dataset = spark.read.option("header", "true")
            .schema(StructType(
                StructField("ID", IntegerType, false, Metadata.empty) ::
                    StructField("FIRST_NAME", StringType, false, Metadata.empty) ::
                    StructField("LAST_NAME", StringType, true, Metadata.empty) ::
                    StructField("GENDER", StringType, false, Metadata.empty) ::
                    StructField("GRADE", DoubleType, false, Metadata.empty) :: Nil
            ))
            .csv(input)
        dataset.show(19, false)
    }
}
