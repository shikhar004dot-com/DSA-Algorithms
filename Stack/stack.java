class stack{
    int top=-1;
    int size=5;
    int [] st=new int[size];

    void push(int x){
        if(top==size-1){
            System.out.println("Overflow");
        }
        else{
            top++;
            st[top]=x;
        }
    }
    int pop(){
        if(top==-1){
            System.out.println("Underflow");
            return -1;
        }
        return st[top--];
    }
    int peek(){
        if(top==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        return st[top];
    }
     public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top==size - 1;
    }

    void display(){
        if(top==-1){
            System.out.println("Stack is empty");
            return;
        }
        for(int i=top;i>=0;i--){
            System.out.print(st[i]+" ");
        }
        System.out.println();

    }
}