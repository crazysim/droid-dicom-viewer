/*
 *
 * Copyright (C) 2011 Pierre Malarme
 *
 * Authors: Pierre Malarme <pmalarme at ulb.ac.be>
 *
 * Institution: Laboratory of Image Synthesis and Analysis (LISA)
 *              Faculty of Applied Science
 *              Universite Libre de Bruxelles (U.L.B.)
 *
 * Website: http://lisa.ulb.ac.be
 *
 * This file <DICOMMetaInformation.java> is part of Droid Dicom Viewer.
 *
 * Droid Dicom Viewer is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Droid Dicom Viewer is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Droid Dicom Viewer. If not, see <http://www.gnu.org/licenses/>.
 *
 * Released date: 17-02-2011
 *
 * Version: 1.0
 *
 */

package be.ac.ulb.lisa.idot.dicom.data;

/**
 * DICOM file meta informations.
 * 
 * @author Pierre Malarme
 * @version 1.0
 *
 */
public class DICOMMetaInformation {
	
	// ---------------------------------------------------------------
	// - VARIABLES
	// ---------------------------------------------------------------
	
	/**
	 * Length of the meta information. 
	 */
	private long mGroupLength = -1;
	
	
	/**
	 * SOP Class UID.
	 */
	private String mSOPClassUID = "";
	
	/**
	 * SOP Instance UID. 
	 */
	private String mSOPInstanceUID = "";
	
	/**
	 * Transfer syntax UID.
	 * 
	 */
	private String mTransferSyntaxUID = "";
	
	/**
	 * Implementation Class UID. 
	 */
	private String mImplementationClassUID = "";
	
	/**
	 * Implementation version name.
	 */
	private String mImplementationVersionName = "";
	
	/**
	 * Application Entity Title.
	 */
	private String mAET = "";

    /**
	 * Patient Name
	 */
	private String mPatientName = "";
	
	
	// ---------------------------------------------------------------
	// + CONSTRUCTOR
	// ---------------------------------------------------------------
	
	public DICOMMetaInformation() {
		
	}
	
	
	// ---------------------------------------------------------------
	// + FUNCTIONS
	// ---------------------------------------------------------------
	
	// Methods generated by Eclipse.
	/**
	 * @return the mGroupLength
	 */
	public long getGroupLength() {
		return mGroupLength;
	}
	
	/**
	 * @return the mSOPClassUID
	 */
	public String getSOPClassUID() {
		return mSOPClassUID;
	}
	
	/**
	 * @return the mSOPInstanceUID
	 */
	public String getSOPInstanceUID() {
		return mSOPInstanceUID;
	}
	
	/**
	 * @return the mTransferSyntaxUID
	 */
	public String getTransferSyntaxUID() {
		return mTransferSyntaxUID;
	}
	
	/**
	 * @return the mImplementationClassUID
	 */
	public String getImplementationClassUID() {
		return mImplementationClassUID;
	}
	
	/**
	 * @return the mImplementationVersionName
	 */
	public String getImplementationVersionName() {
		return mImplementationVersionName;
	}
	
	/**
	 * @return the mAET
	 */
	public String getAET() {
		return mAET;
	}
	
	/**
	 * @param mGroupLength the mGroupLength to set
	 */
	public void setGroupLength(long mGroupLength) {
		this.mGroupLength = mGroupLength;
	}
	
	/**
	 * @param mSOPClassUID the mSOPClassUID to set
	 */
	public void setSOPClassUID(String mSOPClassUID) {
		this.mSOPClassUID = mSOPClassUID;
	}
	
	/**
	 * @param mSOPInstanceUID the mSOPInstanceUID to set
	 */
	public void setSOPInstanceUID(String mSOPInstanceUID) {
		this.mSOPInstanceUID = mSOPInstanceUID;
	}
	
	/**
	 * @param mTransferSyntaxUID the mTransferSyntaxUID to set
	 */
	public void setTransferSyntaxUID(String mTransferSyntaxUID) {
		this.mTransferSyntaxUID = mTransferSyntaxUID;
	}
	
	/**
	 * @param mImplementationClassUID the mImplementationClassUID to set
	 */
	public void setImplementationClassUID(String mImplementationClassUID) {
		this.mImplementationClassUID = mImplementationClassUID;
	}
	
	/**
	 * @param mImplementationVersionName the mImplementationVersionName to set
	 */
	public void setImplementationVersionName(String mImplementationVersionName) {
		this.mImplementationVersionName = mImplementationVersionName;
	}
	
	/**
	 * @param mAET the mAET to set
	 */
	public void setAET(String mAET) {
		this.mAET = mAET;
	}

    /**
     * @return the patient's name
     */
    public String getPatientName() {
        return mPatientName;
    }

    /**
     *
     * @param mPatientName is the patrient name to set
     */
    public void setPatientName(String mPatientName) {
        this.mPatientName = mPatientName;
    }
}
