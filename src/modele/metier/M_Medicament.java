/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modele.metier;

/**
 *
 * @author btssio
 */
public class M_Medicament {
    
    private String med_depotLegal;
    private String med_nomCommercial;
    private Famille med_fam;
    private String med_composition;
    private String med_effets;
    private String med_contreindic;
    private float med_prixEchantillon; 

    public String getMed_depotLegal() {
        return med_depotLegal;
    }

    public void setMed_depotLegal(String med_depotLegal) {
        this.med_depotLegal = med_depotLegal;
    }

    public String getMed_nomCommercial() {
        return med_nomCommercial;
    }

    public void setMed_nomCommercial(String med_nomCommercial) {
        this.med_nomCommercial = med_nomCommercial;
    }

    public Famille getMed_fam() {
        return med_fam;
    }

    public void setMed_fam(Famille med_fam) {
        this.med_fam = med_fam;
    }

    public String getMed_composition() {
        return med_composition;
    }

    public void setMed_composition(String med_composition) {
        this.med_composition = med_composition;
    }

    public String getMed_effets() {
        return med_effets;
    }

    public void setMed_effets(String med_effets) {
        this.med_effets = med_effets;
    }

    public String getMed_contreindic() {
        return med_contreindic;
    }

    public void setMed_contreindic(String med_contreindic) {
        this.med_contreindic = med_contreindic;
    }

    public float getMed_prixEchantillon() {
        return med_prixEchantillon;
    }

    public void setMed_prixEchantillon(float med_prixEchantillon) {
        this.med_prixEchantillon = med_prixEchantillon;
    }
    
}
