
package bai2;

import java.util.Scanner;


public class Matrix {
    private float a[][];

    public Matrix() {
        a=new float[3][3];
    }
    
    public Matrix(int rows,int cols){
        a=new float[rows][cols];
    }
    
    public Matrix add(Matrix m){
        Matrix kq=new Matrix(a.length,a[0].length);
        if(this.a.length == m.a.length && this.a[0].length == m.a[0].length){
            
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[0].length;j++){
                    kq.a[i][j]=this.a[i][j]+m.a[i][j];
                }
            }
        }
        return kq;
    }
    
    public Matrix sub(Matrix m){
        Matrix kq=new Matrix(a.length,a[0].length);
        if(this.a.length == m.a.length && this.a[0].length == m.a[0].length){
            
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[0].length;j++){
                    kq.a[i][j]=this.a[i][j]-m.a[i][j];
                }
            }
        }
        return kq;
    }
    
    public Matrix neg(){
        Matrix negMatrix=new Matrix(a.length,a[0].length);
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                negMatrix.a[i][j]=this.a[i][j]*-1;
            }
        }
        return negMatrix;
    }
    
    public Matrix transpose(){
        Matrix transposeMatrix=new Matrix(a[0].length,a.length);
         for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                transposeMatrix.a[j][i]=a[i][j];
            }
        }
        return transposeMatrix;
    }
    
    public Matrix mul(Matrix m){
        Matrix mulMatrix=new Matrix(a.length, m.a[0].length);
        if(a[0].length == m.a.length){
            for(int i=0;i<a.length;i++){
                for(int j=0;j<m.a[0].length;j++){
                    for(int t=0;t<a[0].length;t++){
                        mulMatrix.a[i][j]+=a[i][t] * m.a[t][j];
                    }
                }
            }
        }
        return mulMatrix;
    }
    
    public void print(){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public void input(){
        Scanner s=new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]=s.nextFloat();
            }
            
        }
    }
}
