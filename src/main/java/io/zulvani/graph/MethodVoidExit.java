package io.zulvani.graph;

public class MethodVoidExit {

    public MethodVoidExit() {
        test();
    }

    public static void main(String[] args){
        new MethodVoidExit();
    }

    private void test(){
        int[] list = new int[]{9,2,1,2,3,4,5,6};
        for (int i : list) {
            if(i == 3){
                return;
            }

            System.out.println(i);
        }
    }
}
