class Stack{
    private int[] dataArray;

    Stack(){
        dataArray = new int [0];
    }
    public void push(int data){
        extendArray();
        dataArray[dataArray.length-1] = data;

    }
    private void extendArray(){
        int[] tempDataArray = new int[dataArray.length+1];
        for(int i=0; i< dataArray.length; i++){
            tempDataArray[i] = dataArray[i];

        }
        dataArray = tempDataArray;
    }

    public void printStack(){
        if(dataArray.length>0) {
            System.out.print("[ ");
            for (int i = dataArray.length - 1; i >= 0; i--) {
                System.out.print(dataArray[i] + ", ");
            }
            System.out.println("\b\b]");
        }else{
            System.out.println("[empty]");
        }
    }

    public void pop(){
        shortArray();

    }

    public void shortArray(){
        if(dataArray.length>0) {
            int[] temDataArray = new int[dataArray.length - 1];
            for (int i = 0; i < temDataArray.length; i++) {
                temDataArray[i] = dataArray[i];
            }
            dataArray = temDataArray;

        }else{
            System.out.println("Stack is empty.");
        }
    }
    public int size(){
        return dataArray.length;
    }


    public boolean contains(int data){
        for(int number : dataArray){
            if(data == number){
                return true;
            }
        }
        return false;
    }


}

class Demo {
    public static void main(String[] args) {
    Stack s1 = new Stack();
    boolean isExist;
    s1.printStack();
    System.out.println("Size of the stack "+s1.size());

    s1.push(10);
    s1.push(20);
    s1.push(30);
    s1.push(40);
    s1.push(50);
    s1.printStack();
    System.out.println("Size of the stack "+s1.size());
    isExist = s1.contains(40);
    System.out.println("Contains 40 : "+isExist);


    s1.pop();
    s1.printStack();
    System.out.println("Size of the stack "+s1.size());
    isExist = s1.contains(90);
    System.out.println("Contains 90 : "+isExist);

    }
}