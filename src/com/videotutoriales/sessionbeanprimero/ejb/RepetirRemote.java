package com.videotutoriales.sessionbeanprimero.ejb;

import javax.ejb.Remote;

@Remote
public interface RepetirRemote {

    String repetir(String repitiendo);
    
}
