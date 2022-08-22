package info.xiaomo.tree;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class TreeNode implements Serializable {
    private int key;
    private TreeNode parentNode;
    private List<TreeNode> childrenNode;
    private Object data;


    public TreeNode(int key, Object data) {
        this.key = key;
        this.data = data;
    }


}
