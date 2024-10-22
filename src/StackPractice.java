import java.util.*;
public class StackPractice {
   // Que 8 Maximum Rectangular Area in Histogram
    public static void maxArea(int arr[]){
       int maxArea = 0;
       int nxsr[] = new int[arr.length];
       int nxsl[] = new int[arr.length];

       // next smaller Right
       Stack<Integer> s = new Stack<>();

       for(int i= arr.length-1; i>=0; i--){
          while (!s.isEmpty() && arr[s.peek()] >= arr[i]){
             s.pop();
          }
          if(s.isEmpty()){
             nxsr[i] = arr.length;
          }else {
             nxsr[i] = s.peek();
          }
          s.push(i);
       }
       // nxt smaller left
        s = new Stack<>();
       for(int i= 0; i<arr.length; i++){
          while (!s.isEmpty() && arr[s.peek()] >= arr[i]){
             s.pop();
          }
          if(s.isEmpty()){
             nxsl[i] = arr.length;
          }else {
             nxsl[i] = s.peek();
          }
          s.push(i);
       }
       // max area
       for(int i=0; i<arr.length; i++){
          int height = arr[i];
          int width = nxsr[i] - nxsl[i] -1;
          int currArea = height*width;
          maxArea = Math.max(currArea, maxArea);
       }
       System.out.println("max area in histogram is " + maxArea);
    }
   public static void main(String[] args) {
     int arr[] = {2, 1, 5, 6, 2, 3}; // height in histogram
      maxArea(arr);
   }
}

//   // Que 7 . Duplicate Parentheses
//   public static boolean isDuplicate(String str){
//      Stack<Character> s = new Stack<>();
//
//      for (int i=0; i<str.length(); i++){
//         char ch = str.charAt(i);
//
//         // closing
//         if(ch == ')'){
//            int count = 0;
//            while (s.peek() != '('){
//               s.pop();
//               count++;
//            }
//            if(count < 1){
//               return true; // duplicate
//            }else {
//               s.pop();   //  opening pair pop
//            }
//         }else {
//            // opening
//            s.push(ch);
//         }
//      }
//      return false;
//   }
//   public static void main(String[] args) {
//      String str1 = "((a+b))";
//      String str2 = "(a-b)";
//      System.out.println(isDuplicate(str1));
//      System.out.println(isDuplicate(str2));
//   }
//}


//   // Que 6. Valid Parentheses
//    public static boolean isValid(String str){
//       Stack<Character> s = new Stack<>();
//       for(int i=0; i<str.length(); i++){
//          char ch =  str.charAt(i);
//
//          if(ch == '(' || ch == '{' || ch == '['){  // opening
//             s.push(ch);
//          }else {
//             // closing
//             if(s.isEmpty()){
//                return false;
//             }
//             if ((s.peek() == '(' && ch == ')')
//                || (s.peek() == '{' && ch == '}')
//                || (s.peek() == '[' && ch == ']')){
//                s.pop();
//             }else {
//                return false;
//             }
//          }
//       }
//       if(s.isEmpty()){
//          return true;
//       }else {
//          return false;
//       }
//    }
//   public static void main(String[] args) {
//     String str = "([])";
//      System.out.println(isValid(str));
//   }
//}
//



//    // Que 4. stock span please solve
//
//    // Que 5. Next Greater Element
//
//    public static void main(String[] args) {
//      int arr[] = {6, 8, 0, 1, 3};
//      Stack<Integer> s = new Stack<>();
//      int nexGreater[] = new int[arr.length];
//
//      for (int i= arr.length-1; i>=0; i--){
//
//          // 1 while
//          while (!s.isEmpty() && arr[s.peek()] <= arr[i]){
//              s.pop();
//          }
//          // 2 if-else
//          if (s.isEmpty()){
//              nexGreater[i] = -1;
//          }else {
//              nexGreater[i] = arr[s.peek()];
//          }
//          // 3 push in s
//          s.push(i);
//      }
//      for (int i=0; i<nexGreater.length; i++){
//          System.out.print(nexGreater[i] + " ");
//      }
//        System.out.println();
//    }
//}
//  related Que
       // H.W
       // next Greater Right
       //next Greater Left
      //next Smaller Right
      //next Smaller Left




//    // Que 3 . Reverse a stack
//
//    public static void pushAtBottom(Stack<Integer> s, int data){
//        if(s.isEmpty()){
//            s.push(data);
//            return;
//        }
//        int top = s.pop();
//        pushAtBottom(s, data);
//        s.push(top);
//    }
//    public static void reverseStack(Stack<Integer> s){
//        if(s.isEmpty()){
//            return;
//        }
//        int top = s.pop();
//        reverseStack(s);
//        pushAtBottom(s, top);
//    }
//    public static void printStack(Stack<Integer> s){
//        while (!s.isEmpty()){
//            System.out.println(s.pop());
//        }
//    }
//
//    public static void main(String[] args) {
//       Stack<Integer> s = new Stack<>();
//       s.push(1);
//       s.push(2);
//       s.push(3);
//     // 3 , 2, 1
//     //  printStack(s);
//       reverseStack(s);
//       printStack(s);
//
//       //
//    }
//}
//    // Que2 Reverse a string using a Stack
//    public static String reverseString(String str){
//        Stack<Character> s = new Stack<>();
//        int idx = 0;
//        while (idx < str.length()){
//            s.push(str.charAt(idx));
//            idx++;
//        }
//        StringBuilder result = new StringBuilder("");
//        while (!s.isEmpty()){
//            char curr =  s.pop();
//            result.append(curr);
//        }
//        return result.toString();
//    }
//    public static void main(String[] args) {
//       String str = "mahfooz";
//       String res = reverseString(str);
//        System.out.println(res);
//    }
//}

//    // Que1. push at bottom
//    public static void pushAtBottom(Stack<Integer> s, int data){
//        if(s.isEmpty()){
//            s.push(data);
//            return;
//        }
//        int top = s.pop();
//        pushAtBottom(s, data);
//        s.push(top);
//    }
//
//    public static void main(String[] args) {
//        Stack<Integer> s = new Stack<>();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//
//        pushAtBottom(s, 4);
//        while (!s.isEmpty()){
//            System.out.println(s.pop());
//        }
//    }
//}
