   class triangle {
    public static void main(String[] args) {
        int n=5;
        for(int row=1; row<=n; row++ ){
            for(int coloumn=1; coloumn<=row; coloumn++){
                int sum = row+coloumn;
                if (sum%2==0) {
                System.out.print("1 ");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
