/**
 * The MIT License
 *
 *  Copyright (c) 2017, Mahmoud Ben Hassine (mahmoud.benhassine@icloud.com)
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in
 *  all copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  THE SOFTWARE.
 */



import Entidades.*;
import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Rule;

@Rule(name = "Hello World rule", description = "Always say hello world")
public class r_compra_vip {

   private  boolean r=false;
   Pedido p;
   Cliente c;
    @Condition
    public boolean compraVip( @Fact ( " compra cliente vip " ) Cliente c){
    this.c = c;
        if(c.isVip()){
            
             return  true;
        }
           
        return  false;
    }
    
    @Condition
    public boolean hayDescuento(@Fact("hayDesuento") Pedido p)
    {
        this.p = p;
        if(p.getImportePedido()>=50000)
            return true;
        
        return false;
    }
    
    @Action
    public void then(Cliente c, Pedido p) throws Exception {
        p.setImportePedido(p.getImportePedido()-p.getImportePedido()*0.05);
        System.out.println("Descuento aplicado");
    }

}
