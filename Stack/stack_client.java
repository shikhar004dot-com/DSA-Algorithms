class stack_client{  // defines a class name stack_client
    public static void main(String[] args) {
        stack st=new stack();  // our custom class

        st.push(10);  //top=-1-->0  st[0]=10
        st.push(20);  //top=1 --> st[1]=20
        st.push(30);  //top=2 -->st[2]=30
        st.push(40);  //top=3 -->st[3]=40  this will be at the top of the stack
        st.display();
        System.out.println(st.peek()); // returns top element
        st.pop();
        st.display();

    }

    // stack--> our custom class (from stack.java)
    //st--> reference variable
    //new stack()--> creates object in memory

// st---> stack object
        //top=-1
        //st=[_,_,_,_,_]

        
}