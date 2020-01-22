/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jusco.servises;

import com.jusco.model.AssetREg;
import com.jusco.model.AssetTrf;
import com.jusco.model.NewAsset;
import com.jusco.model.OldAsset;
import com.jusco.model.Users;
import java.util.List;

/**
 *
 * @author ACHIN
 */
public interface LoginServises {

    public List<Users> getLogin(Users users);

    public int saveAssetREg(AssetREg assetreg);

    public int saveAssetTrf(AssetTrf assettrf);

    public int saveNewAsset(NewAsset newasset);

    public int saveOldAsset(OldAsset oldasset);
}
