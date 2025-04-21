class Counter {
    private static int count = 0;
    private int id;
    
    public Counter() {
        count++;
        id = count;
        System.out.println("Created object #" + id);
    }
    
    public static int getCount() {
        return count;
    }
    
    public int getId() {
        return id;
    }
}

public class main {
    public static void main(String[] args) {
        System.out.println("Initial object count: " + Counter.getCount());
        
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();
        
        System.out.println("Object count after creating 3 objects: " + Counter.getCount());
        
        Counter obj4 = new Counter();
        Counter obj5 = new Counter();
        
        System.out.println("Final object count: " + Counter.getCount());
    }
}