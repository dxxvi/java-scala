package home.example.hk2.service;

import org.jvnet.hk2.annotations.Service;

@Service
public class MySubServiceImpl implements MySubService {
    @Override public int min(int x, int y) {
        return x < y ? x : y;
    }
}
