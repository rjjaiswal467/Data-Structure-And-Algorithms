package practice1;

public class SingletonExample {

    static SingletonExample singletonExample= new SingletonExample();

    private SingletonExample(){

    }
    public SingletonExample returnobj(){

        return singletonExample;
    }
}

