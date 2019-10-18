/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingcrud.view;

import java.util.HashMap;

/**
 *
 * @author ytr
 */
public interface IView {
    public void onUpdate(HashMap<String, Object> updatedData);
    public void onDelete(Object id);
    public void setData(Object data);
    
}
