/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.StiAncsyphilistreatment;
import java.util.List;

/**
 *
 * @author Training3
 */
public interface Sti_ancsyphilistreatmentable {

    int AddStiAncsyphilistreatmentable(StiAncsyphilistreatment sti);

    List<StiAncsyphilistreatment> getStiAncsyphilistreatment();

    int editStiAncsyphilistreatment(StiAncsyphilistreatment tested);

    int removeStiAncsyphilistreatment(int id);

    /**
     *
     * @return
     */
   

}
