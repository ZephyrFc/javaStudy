package com.example.demo.demo.model;

import java.io.Serializable;

public class PmsProductWithBLOBs extends PmsProduct implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product.description
     *
     * @mbg.generated Thu Aug 13 11:04:33 CST 2020
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product.detail_desc
     *
     * @mbg.generated Thu Aug 13 11:04:33 CST 2020
     */
    private String detailDesc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product.detail_html
     *
     * @mbg.generated Thu Aug 13 11:04:33 CST 2020
     */
    private String detailHtml;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product.detail_mobile_html
     *
     * @mbg.generated Thu Aug 13 11:04:33 CST 2020
     */
    private String detailMobileHtml;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pms_product
     *
     * @mbg.generated Thu Aug 13 11:04:33 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product.description
     *
     * @return the value of pms_product.description
     *
     * @mbg.generated Thu Aug 13 11:04:33 CST 2020
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product.description
     *
     * @param description the value for pms_product.description
     *
     * @mbg.generated Thu Aug 13 11:04:33 CST 2020
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product.detail_desc
     *
     * @return the value of pms_product.detail_desc
     *
     * @mbg.generated Thu Aug 13 11:04:33 CST 2020
     */
    public String getDetailDesc() {
        return detailDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product.detail_desc
     *
     * @param detailDesc the value for pms_product.detail_desc
     *
     * @mbg.generated Thu Aug 13 11:04:33 CST 2020
     */
    public void setDetailDesc(String detailDesc) {
        this.detailDesc = detailDesc == null ? null : detailDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product.detail_html
     *
     * @return the value of pms_product.detail_html
     *
     * @mbg.generated Thu Aug 13 11:04:33 CST 2020
     */
    public String getDetailHtml() {
        return detailHtml;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product.detail_html
     *
     * @param detailHtml the value for pms_product.detail_html
     *
     * @mbg.generated Thu Aug 13 11:04:33 CST 2020
     */
    public void setDetailHtml(String detailHtml) {
        this.detailHtml = detailHtml == null ? null : detailHtml.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product.detail_mobile_html
     *
     * @return the value of pms_product.detail_mobile_html
     *
     * @mbg.generated Thu Aug 13 11:04:33 CST 2020
     */
    public String getDetailMobileHtml() {
        return detailMobileHtml;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product.detail_mobile_html
     *
     * @param detailMobileHtml the value for pms_product.detail_mobile_html
     *
     * @mbg.generated Thu Aug 13 11:04:33 CST 2020
     */
    public void setDetailMobileHtml(String detailMobileHtml) {
        this.detailMobileHtml = detailMobileHtml == null ? null : detailMobileHtml.trim();
    }
}