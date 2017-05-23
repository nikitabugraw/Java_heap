package chapter11;


public class JavaHeapANNIHILATIONULTRAVIOLENCEKILLJVMclass {
    public static void main(String[] args) {
        Object[] ref  = new Object[1];
        int counter =0;
        while(true) {
            ref = new Object[]{ref, new byte[1000]};
            System.out.println(counter++);
        }
    }
}
