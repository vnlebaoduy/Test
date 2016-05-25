package com.example.vnleb.test.Data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

/**
 * Created by vnleb on 07-May-16.
 */
public class User {

    @SerializedName("BIEN_SO")
    @Expose
    private String BIENSO;
    @SerializedName("TEN_CHU_SO_HUU")
    @Expose
    private String TENCHUSOHUU;
    @SerializedName("DANG_KY_CO_GTRI_DEN")
    @Expose
    private Object DANGKYCOGTRIDEN;
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
     *
     * @return
     * The BIENSO
     */
    public String getBIENSO() {
        return BIENSO;
    }

    /**
     *
     * @param BIENSO
     * The BIEN_SO
     */
    public void setBIENSO(String BIENSO) {
        this.BIENSO = BIENSO;
    }

    /**
     *
     * @return
     * The TENCHUSOHUU
     */
    public String getTENCHUSOHUU() {
        return TENCHUSOHUU;
    }

    /**
     *
     * @param TENCHUSOHUU
     * The TEN_CHU_SO_HUU
     */
    public void setTENCHUSOHUU(String TENCHUSOHUU) {
        this.TENCHUSOHUU = TENCHUSOHUU;
    }

    /**
     *
     * @return
     * The DANGKYCOGTRIDEN
     */
    public Object getDANGKYCOGTRIDEN() {
        return DANGKYCOGTRIDEN;
    }

    /**
     *
     * @param DANGKYCOGTRIDEN
     * The DANG_KY_CO_GTRI_DEN
     */
    public void setDANGKYCOGTRIDEN(Object DANGKYCOGTRIDEN) {
        this.DANGKYCOGTRIDEN = DANGKYCOGTRIDEN;
    }

    /**
     *
     * @return
     * The ID
     */
    public String getID() {
        return ID;
    }

    /**
     *
     * @param ID
     * The ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "User{" +
                "BIENSO='" + BIENSO + '\'' +
                ", TENCHUSOHUU='" + TENCHUSOHUU + '\'' +
                ", DANGKYCOGTRIDEN=" + DANGKYCOGTRIDEN +
                ", ID='" + ID + '\'' +
                '}';
    }
}