// Our goal is to find maximum value at each level in the given tree
// For this we use level order traversal that uses queue

// Problem Link : https://practice.geeksforgeeks.org/problems/ec277982aea7239b550b28421e00acbb1ea03d2c/1

// Code :- 

class Solution {
    ArrayList<Integer> maximumValue(Node node) {
       //code here
       
       ArrayList<Integer> res= new ArrayList<>();
       int i,n;
       Queue<Node> q = new LinkedList<Node>();
       q.add(node);
       while(!q.isEmpty()){
          n=q.size();
          int curMax = Integer.MIN_VALUE;
          for(i=0;i<n;i++){
              Node tempNode = q.poll();
              curMax=Math.max(curMax,tempNode.data);
              
              if(tempNode.left!=null){
                  q.add(tempNode.left);
              }
              if(tempNode.right!=null){
                  q.add(tempNode.right);
              }
          }
          res.add(curMax);
       }
       return res;
    }
}
