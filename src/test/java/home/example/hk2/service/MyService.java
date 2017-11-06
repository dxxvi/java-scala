package home.example.hk2.service;

import org.jvnet.hk2.annotations.Contract;

@Contract
public interface MyService {
    int min(int x, int y, int z);
}
