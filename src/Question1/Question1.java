package Question1;

public class Question1 
{

    public static void main(String[] args) 
    {
        int[][] productSales = new int[2][3];
        productSales[0][0] = 300;
        productSales[0][1] = 150;
        productSales[0][2] = 700;
        productSales[1][0] = 250;
        productSales[1][1] = 200;
        productSales[1][2] = 600;
        
        IProduct report = new ProductSales();
        
        System.out.println("PRODUCT SALES REPORT - 2025");
        System.out.println("---------------------------");
        System.out.println("Total sales: " + report.TotalSales(productSales));
        System.out.println("Average sales: " + report.AverageSales(productSales));
        System.out.println("Maximum sale: " + report.MaxSale(productSales));
        System.out.println("Minimum sale: " + report.MinSale(productSales));
        System.out.println("---------------------------");
    }    
    
}







