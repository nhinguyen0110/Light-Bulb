/*
------------------------------------------------------------------------------
   Name:     NhiNguyen_IS221_Ch4_PP4_2_Bulb
   Author:   Nhi Nguyen
   Date:     Feb 21, 2023
   Language: Java
   Purpose:  The purpose of this program is to write a class called NhiNguyen_IS221_Ch4_PP4_2_Bulb that
             represents a light bulb that can be turned on and off.
------------------------------------------------------------------------------
   ChangeLog:
   Who:      Nhi Nguyen            Date:     Feb 21, 2023
   Desc.:    This is the original version of the code.
------------------------------------------------------------------------------
*/

package nhinguyen_is221_ch4_pp4_2;

public class NhiNguyen_IS221_Ch4_PP4_2_Bulb {
    private boolean bln_isOn;
    
    public NhiNguyen_IS221_Ch4_PP4_2_Bulb() {
        bln_isOn = false;
    }
    
    public void turnOn() {
        bln_isOn = true;
    }
    
    public void turnOff() {
        bln_isOn = false;
    }
    
    public boolean bln_isOn() {
        return bln_isOn;
    }
}

