package study.augustseventeen;

import java.util.ArrayList;
import java.util.List;

public class No2Answer {
//        public List<List<Integer>> levelOrder(TreeNode root) {
//            //1. Recursion(DFS)
//            List<List<Integer>> result = new ArrayList<List<Integer>>();
//            levelorderTraversal(result,0,root);
//            return result;
//
//        }

//        private void levelorderTraversal(List<List<Integer>> result, int level, TreeNode node) {
//            if (node == null) {
//                return;
//            }
//            if (result.size() <= level) {  // 현재 level List가 없을 경우  ex)size가 1이면 0뎁스까지밖에 없음. 1뎁스일때 만들어줘야함.
//                List<Integer> row = new ArrayList<>();
//                row.add(node.val);
//                result.add(row);
//            } else {
//                List<Integer> row = result.get(level);
//                row.add(node.val);
//            }
//            levelorderTraversal(result, level + 1, node.left);
//            levelorderTraversal(result, level + 1, node.right);
//        }
}
