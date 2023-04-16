public class EX09_05 {
    public static void main(String[] args) {
        oldBadWay();
        newGoodWay();
    }

    public static void oldBadWay() {
        int[] sales2014 = {500, 720, 515, 377, 400, 435, 510, 1010, 894, 765, 992, 1125};
        int[] staff2014 = {7, 5, 5, 5, 5, 6, 6, 7, 7, 8, 9, 9};
        int[] salesPerStaff = new int [12];
        int totalSales2014 = 0;
        salesPerStaff [0] = sales2014 [0]/staff2014 [0];
        salesPerStaff [1] = sales2014 [1]/staff2014 [1]; 
        salesPerStaff [2] = sales2014 [2]/staff2014 [2]; 
        salesPerStaff [3] = sales2014 [3]/staff2014 [3]; 
        salesPerStaff [4] = sales2014 [4]/staff2014 [4]; 
        salesPerStaff [5] = sales2014 [5]/staff2014 [5]; 
        salesPerStaff [6] = sales2014 [6]/staff2014 [6]; 
        salesPerStaff [7] = sales2014 [7]/staff2014 [7]; 
        salesPerStaff [8] = sales2014 [8]/staff2014 [8]; 
        salesPerStaff [9] = sales2014 [9]/staff2014 [9]; 
        salesPerStaff [10] = sales2014 [10]/staff2014 [10]; 
        salesPerStaff [11] = sales2014 [11]/staff2014 [11];
        totalSales2014 = sales2014 [0] + sales2014 [1] + sales2014 [2] +sales2014 [3] + sales2014 [4] + sales2014 [5] + sales2014 [6] + sales2014 [7] + sales2014 [8] + sales2014 [9] + sales2014 [10] + sales2014 [11];
        System.out.println(totalSales2014);
    }

    public static void newGoodWay() {
        int[] sales2014 = {500, 720, 515, 377, 400, 435, 510, 1010, 894, 765, 992, 1125}; //Monthly sales
        int[] staff2014 = {7, 5, 5, 5, 5, 6, 6, 7, 7, 8, 9, 9}; //Monthly staff members
        int[] salesPerStaff = new int [12]; //empty list to be filled in 
        int totalSales2014 = 0;

        //Laskee sales per staff
        for (int i = 0; i <= 11; i++) {
            salesPerStaff [i] = sales2014 [i]/staff2014 [i];
        }

        //Laskee total sales yhteen
        for (int i = 0; i <= 11; i++) {
            totalSales2014 = totalSales2014 + sales2014[i];
        }

        System.out.println(totalSales2014);
    }
}