public class XiaoMiDemo {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        while (!stack.isEmpty()) {
            System.out.println("value->" + stack.peek());
        }
    }

    /**
     * 栈的翻转
     * 未考虑栈的扩容，如果存储的数据量比较大，则会出现问题
     */
    static class Stack<T> {
        int[] ary = {};         //数据载体
        int mElementSize = 0;   //元素数量

        private Stack(){ }

        public Stack(int size) {
            ary = new int[size];
        }

        public boolean isEmpty() { return mElementSize <= 0; }

        public void push (int data) {
            ary[mElementSize++] = data;
        }

        public int peek() {
            mElementSize--;
            return ary[mElementSize];
        }
    }
}
