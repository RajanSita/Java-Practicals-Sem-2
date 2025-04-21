import java.util.Scanner;

class Matrix {
    private int[][] data;
    private int rows;
    private int cols;
    
    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        data = new int[rows][cols];
    }
    
    public void input(Scanner scanner) {
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i][j] = scanner.nextInt();
            }
        }
    }
    
    public void display() {
        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public Matrix add(Matrix other) {
        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[i][j] + other.data[i][j];
            }
        }
        return result;
    }
    
    public Matrix subtract(Matrix other) {
        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[i][j] - other.data[i][j];
            }
        }
        return result;
    }
    
    public Matrix multiply(Matrix other) {
        Matrix result = new Matrix(rows, other.cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                for (int k = 0; k < cols; k++) {
                    result.data[i][j] += this.data[i][k] * other.data[k][j];
                }
            }
        }
        return result;
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Creating 2x2 matrices");
        
        Matrix mat1 = new Matrix(2, 2);
        System.out.println("Enter elements for first matrix:");
        mat1.input(scanner);
        
        Matrix mat2 = new Matrix(2, 2);
        System.out.println("Enter elements for second matrix:");
        mat2.input(scanner);
        
        int choice;
        do {
            System.out.println("\nMatrix Operations:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Display Both Matrices");
            System.out.println("0. Exit");
            
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    Matrix sum = mat1.add(mat2);
                    System.out.println("Result of Addition:");
                    sum.display();
                    break;
                case 2:
                    Matrix diff = mat1.subtract(mat2);
                    System.out.println("Result of Subtraction:");
                    diff.display();
                    break;
                case 3:
                    Matrix product = mat1.multiply(mat2);
                    System.out.println("Result of Multiplication:");
                    product.display();
                    break;
                case 4:
                    System.out.println("First Matrix:");
                    mat1.display();
                    System.out.println("Second Matrix:");
                    mat2.display();
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 0);
        
        scanner.close();
    }
}