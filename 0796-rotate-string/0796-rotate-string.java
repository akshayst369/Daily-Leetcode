class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length())
        {
            return false;
        }
        int length=s.length();
        char[] schars = s.toCharArray();
        for(int i=0; i<s.length();++i)
        {
            schars = rotateonce(schars);
            if(new String(schars).equals(goal)) return true;

        }
        return false;
    }
    private char[] rotateonce(char[] arr)
    {
        char firstchar = arr[0];
        System.arraycopy(arr,1,arr,0,arr.length - 1);
        arr[arr.length - 1] = firstchar;
        return arr;
    }
}