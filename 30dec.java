public class 30dec 
{
    public boolean isAllEqualTo(Node root, int tree_root_data)
    {
        if (root == null)
        {
            return true;
        }
        
        if (root.data != tree_root_data)
        {
            return false;
        }
        
        return isAllEqualTo(root.left, tree_root_data) && isAllEqualTo(root.right, tree_root_data);
    }
    
    public int singlevalued(Node root)
    {
        if (null == root)
        {
            return 0;
        }
        
        int sum = 0;
        
        sum+= singlevalued(root.left);
        sum+= singlevalued(root.right);
        
        // Check if this tree is single valued
        if (isAllEqualTo(root, root.data))
        {
            sum+=1;
        }
        
        return sum;
    }
}
