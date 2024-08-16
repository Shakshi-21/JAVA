class Test 
{
    int a;

    Test(int i) {
        a = i;
    }

    void incbyten(Test obj) {
        obj.a += 10;
    }
}

class abb {
    public static void main(String args[]) {
        Test obj1 = new Test(2);
        System.out.println(obj1.a);
        
        Test obj2 = new Test(obj1.a); 
        obj1.incbyten(obj2); 
        System.out.println(obj2.a);
        
        Test obj3 = new Test(obj2.a); 
        obj1.incbyten(obj3); 
        System.out.println(obj3.a);
    }
}