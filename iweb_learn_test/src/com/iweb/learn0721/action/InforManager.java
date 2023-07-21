package com.iweb.learn0721.action;

import com.iweb.learn0721.pojo.InterA;
import com.iweb.learn0721.pojo.InterB;

public class InforManager {
    public void recordInfo( InterA st){
        st.addName();
        st.addAge();
        st.addGender();


        if ( st instanceof InterB ){
            ((InterB) st).addGrade();
            ((InterB) st).addId();
        }
    }

    public static void main( String[] args ) {
        InforManager im = new InforManager();
        im.recordInfo(new Students());

        System.out.println(InterA.i);
    }
}
