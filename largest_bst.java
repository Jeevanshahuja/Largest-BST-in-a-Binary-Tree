class Solution{
    static class Largest{
        int largest;
    }
    static int largestBst(Node root)
    {
        Largest Largest = new Largest();
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        helper(root , min , max , Largest);
        return Largest.largest;
    }
    public static boolean helper(Node root , int min , int max , Largest Largest ){
        if(root == null){
            return true;
        }
        if(root.data<min || root.data> max){
            return false;
        }
        boolean left = helper(root.left, min , root.data , Largest);
        boolean right = helper(root.right , root.data , max , Largest);
        if(left && right){
            int sizeleft= non(root.left);
            int sizeright= non(root.right);
            int curr = sizeleft + sizeright + 1;
            Largest.largest  = Math.max(Largest.largest,curr);
            return true;
        }
        return false;
    }
    public static int non(Node root){
        if(root == null ){
            return 0;
        }
        return 1 + non(root.left)+non(root.right);
    }
}