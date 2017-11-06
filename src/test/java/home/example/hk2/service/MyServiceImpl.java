package home.example.hk2.service;

import org.jvnet.hk2.annotations.Service;

import javax.inject.Inject;

@Service
public class MyServiceImpl implements MyService {
    private MySubService subService;

    @Inject public MyServiceImpl(MySubService subService) {
        this.subService = subService;
    }

    @Override public int min(int x, int y, int z) {
        int a = subService.min(x, y);
        return subService.min(a, z);
    }
}
