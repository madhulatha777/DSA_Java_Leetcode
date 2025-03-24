package Linked_List.Leetcode_Prblms_LL.Cycles_in_LinkedList;

public class L202_Happy_Number {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while(slow != fast);
        if(slow == 1){
            return true;
        }
        return false;
    }
    public int findSquare(int number){
        int ans = 0;
        while(number > 0){
            int rem = number % 10;
            ans += rem * rem;
            number /= 10;
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
