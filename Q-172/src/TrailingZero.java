public class TrailingZero {
  public int trailingZeroes(int n) {
    long fac = 1;
    int i;
    for (i = 2; i <= n; i++)
        fac *= i;
    
    int count = 0;
    while(fac>0){
        long reminder = fac%10;
        if(reminder==0)
            count++;
          else
            break;
        fac=fac/10;
    }
    return count;
}
}
