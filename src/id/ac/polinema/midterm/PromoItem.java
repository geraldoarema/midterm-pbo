/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author ALDO
 */
//tambahkan ekstends karna PromoItem dari Item//
public class PromoItem extends Item{
    private float promo;

    public PromoItem( String name, float price, int amount,float promo) {
        super(name, price, amount);
        this.promo = promo;
    }
    //untuk mendapatkan total promo//
    public float getTotalPromo(){
    return (price*amount)-(promo*amount);
    }
//untuk mendapatkan nilai promo yang di private//
    public float getPromo() {
        return promo;
    }
    
    
}
