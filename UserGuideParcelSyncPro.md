**Table of Contents**

[INTRODUCTION](#introduction)

- [Overview](#overview)

- [Purpose](#purpose)

[GETTING STARTED](#getting)

- [Set-up Considerations](#set-up)

- [User Access Considerations](#user)

- [Access the ParcelSyncPro](#access)

- [Organization & Navigation of ParcelSync Pro](#organization)

[Exit the transaction in ParcelSync Pro](#exit)

   
# INTRODUCTION


## OVERVIEW

<p align="justify">ParcelSync Pro is a GIS based parcel mapping software that provides an environment to perform parcel maintenance workflows and synchronize changes with Land Record systems. Mappers from the GIS department execute different types of workflows to update GIS data and send information to other external systems.</p> 

<p align="justify">The external systems could be Land Record systems and Deed Queue Management (DeedSync) software. The DeedSync provides a work backlog to mappers and transfer specialists. Upon successful completion of each workflow, information and/or status is updated to GIS, Land Record and DeedSync software.</p>  

<p align="justify">Different Farragut customers may have different Land Record systems (including 3rd party) deployed in the production environment. ParcelSync Pro provides integration to a few of these different Land Record software.</p> 


## PURPOSE

<p align="justify">
This document provides a detailed description of the installation of ParcelSync Pro and functionality of maintaining tax parcel records using ArcGIS Pro and sending workflow data to the Land Record System.</p>  

<span style="color: Blue; ">
  
</span> 

# GETTING STARTED

## 2.1  Set-up Considerations


**- Requirements:**

  A. ArcGIS Pro

  Version 3.0.3

  B. System Requirements Link  

   link [arcgis-pro-system-requirements](https://pro.arcgis.com/en/pro-app/latest/get-started/arcgis-pro-system-requirements.htm#)       

**- ARCGIS Pro Installation Steps:**

Go to the following link to download and install ArcGIS Pro:      

link: [download-arcgis-pro](https://pro.arcgis.com/en/pro-app/latest/get-started/download-arcgis-pro.htm)

**- Config File Setup:**

   link:  [config-file](https://secure.farragut.com/clients/index.php/apps/files/?dir=/ParcelSyncPro&fileid=148030
)

## 2.2	User Access Considerations

 Username and Password -> Example: xyz/xyz1 (Mapper role) , xyzadmin/xyzadmin1 (Admin role) and xyzreader/xyzreader1 (Reader role)

## 2.3	Access the ParcelSyncPro

**Login Page:**

**Steps:**

1. Click the ‘Login’ button inside the ParcelSyncPro tab.

![Alt text](IMAGES/2.31.jpg)

2. Then login pop up will be opened

![Alt text](IMAGES/2.32.png)

3. Enter Username and Password -> Example: xyz/xyz1 (Mapper role) , xyzadmin/xyzadmin1 (Admin role) and xyzreader/xyzreader1 (Reader role)


4. Click Login button

    ![Alt text](IMAGES/2.33.png)

## 2.4	Organization & Navigation of ParcelSync Pro

**Steps of functionality for different Modules:**

### 2.4.1. ARCGIS Pro page after login 

The below page will open after login successfully. It will show all loaded layers based on configuration.

![Alt text](IMAGES/2.41.png)

### 2.4.2 Create New Transaction
A Transaction can be created from either New tab or from DeedSync Assigned tab.

  Create transaction from the Create New Transaction option in top menu:

1. Click the ‘Create New Transaction’ pro window inside the Parcel sync Pro tab.

![Alt text](IMAGES/2.42.png)

 
2. Then the Transaction Manager window showing below will open.

![Alt text](IMAGES/2.43png.png)

3. Here  choose the transaction type i.e SPLIT and enter the transaction name and create a new Parcel Sync transaction and click the Open button for creating the transaction.

![Alt text](IMAGES/2.44.png)

And as a new transaction is created a new traditional version will also be created showing in the left side inside the ParcelSyncProMap. 

![Alt text](IMAGES/2.44png.png)

After clicking the open button , the page showing a list of several tasks will open.

![Alt text](IMAGES/2.45.png)

Create transaction from the Deed Sync Assigned tab:
1. Click the ‘Create Transaction’ pro window and then click on the DeedSync assigned tab.

![Alt text](IMAGES/2.46.png)

2. Then inside the Deed Sync Assigned Tab, several lists of transactions related to Deed will be shown inside the listbox .

3. Choose the transaction type and enter the transaction name and click the Open button to create the transaction. Created transactions will be shown inside the Open transaction pop up list .

4. Decline Assignment button is used to remove the deed related assignment of the data to the user.

5. View Deed button is used to show Deed related data beside the ParcelSync pro tab.

 6. Cancel button will close the pop up box. 
Then the page will show the list of tasks inside the dockpane. It needs to be completed in a sequential order. After completion of the first task, the next task will be enabled, and transactions can be suspended at any task level.


### 2.4.3 Open Transaction
Click the Open transaction prowindow.

![Alt text](IMAGES/41.png)

It will show lists of all the transactions which were created earlier but not completed and currently not opened by other users. 

![Alt text](IMAGES/42.png)         


Then Select any transaction and click the Open button to open the transaction. In the transaction open process, the version should be switched from Default to Transactional/Traditional.



![Alt text](IMAGES/44.png)


4. Click the Delete button for deleting any transaction

![Alt text](IMAGES/45.png)           
                

  The below confirmation dialog box will  open after clicking the Delete button. 

![Alt text](IMAGES/46.png) 
  

### 2.4.4. Different tasks inside Transaction Manager

#### A. Select Parents Task 

Tap on the button of Select Parents task in the tasks list.

![Alt text](IMAGES/51.png)


Select parcels on the map to be marked as parent.

![Alt text](IMAGES/52.png)



Then the selected list of parcels will be displayed inside the Mark from Map tab.

![Alt text](IMAGES/53.png)


Zoom to Selected button is used to zoom the Selected parcel on the Map.

Clear Selection will clear the selection area of the parcel on the map.

Now tap on the Mark as Parent button.

![Alt text](IMAGES/54.png)


Parcels are marked as parent on the map and the list of parent parcels reflects on the Current list tab.

![Alt text](IMAGES/miss1.png)


Now to complete this task close the pop up and check the checkbox of Select Parents.

![Alt text](IMAGES/miss2.png)

#### B. Transaction Info task


Tap on the button of Transaction Info task in the tasks list.

![Alt text](IMAGES/miss3.png)



Now the pop up window of Transaction information will open.

![Alt text](IMAGES/miss4.png)

Enter the transaction related information like: parcel effective date, deed reference and mapper notes in this pop up.
Get helper button is used to fetch unique transaction id

![Alt text](IMAGES/54.png)

![Alt text](IMAGES/55.png)


Parcel Effective Date field should show date in US format mm/dd/yyyy. This is a required field. By default it will show today's date

![Alt text](IMAGES/56.png)


No possibility to choose/enter the future date.

![Alt text](IMAGES/57.png)


Date format is mm/dd/yyyy, by default it will show today’s date.

![Alt text](IMAGES/58.png)

Entering a future date will throw an error as shown below. 

![Alt text](IMAGES/59.png)

Future dates cannot be selected as in calendar dropdown future dates are not visible.

![Alt text](IMAGES/510.png)


Mapper Notes field should be optional and maximum 1000 characters can be entered and this should be an alphanumeric field.

![Alt text](IMAGES/511.png)


Tap "Load Deed data" button (Transaction should be Deed Sync linked for this button to be visible)
Load Deed Data button is disabled or hidden if transaction is not deed sync linked.
Validate: Effective date field is populated, if document type is "PLAT"  fill Plat book/page fields otherwise fill Deed book/page/date fields.

![Alt text](IMAGES/512.png)

![Alt text](IMAGES/513.png)

Validate Deed/Plat/Document fields (all fields under these categories): 
Date values must be validated (valid date), Effective date rules are applied as described above on date fields, Date fields are optional, If book/page/date/number is entered, all fields into that group are required fields


![Alt text](IMAGES/514.png)

![Alt text](IMAGES/515.png)



Partially entering Deed, Plat and Document fields.


![Alt text](IMAGES/517.png) 


![Alt text](IMAGES/518.png)

![Alt text](IMAGES/519.png)

![Alt text](IMAGES/526.png)

![Alt text](IMAGES/527.png)


Tap on Cancel Button without entering any information. 

![Alt text](IMAGES/519.png)

After clicking the cancel button the pop box will be removed.

![Alt text](IMAGES/520.png)


Tap Cancel after entering some field information.

![Alt text](IMAGES/521.png)

After clicking the cancel button, the information will not be saved and you will be unable to proceed to the next task.

![Alt text](IMAGES/522.png)


Tap on the “Save and Close'' button 

![Alt text](IMAGES/523.png)



Then tap on the Yes button in the confirmation dialog.

![Alt text](IMAGES/524.png)


Now to complete this task check the checkbox of Transaction Info.

![Alt text](IMAGES/525.png)


### C. Use “Non-Fabric” editing workflows for parcel editing- SPLIT

Step 1: Tap on the Split Parcel task button in the above screen which is marked in the yellow color then the split tool gets activated.

![Alt text](IMAGES/2.19.1.png)

Fig 1: Click Split Parcel task button 

![Alt text](IMAGES/2.19.2.png)

Fig 2: Split tool activated

Step 2: Now we will split the parent parcel

![Alt text](IMAGES/2.19.3.png)

Fig: Before Splitting parcel

![Alt text](IMAGES/2.19.4.png)

Fig: After Splitting parcel

Step 3:  Tap on the checkbox of the task and tap on yes to pop up to save the edits made.

![Alt text](IMAGES/2.19.5.png)

![Alt text](IMAGES/2.19.6.png)


Step 4: Split multiple parent parcels.
In below screen we have 2 parent parcels

![Alt text](IMAGES/2.19.7.png)

![Alt text](IMAGES/2.19.8.png)

Step 5: We will not be able to proceed to the next task if even one parent parcel is not splitted.
We have 1 parent parcel in this transaction and we will try to proceed to the next task without marking split.

![Alt text](IMAGES/2.19.9.png)


Step 6: Split the newly created child parcels.
1 parent parcel is split-ed into 2 child parcels

![Alt text](IMAGES/2.19.10.png)


![Alt text](IMAGES/2.19.miss2.png)


![Alt text](IMAGES/2.19.11.png)


Now we will split the 2 newly created child parcels.

![Alt text](IMAGES/2.19.mis.png)


![Alt text](IMAGES/2.19.12.png)

Step 7: When the checkbox of split task is checked, confirmation dialog box with two buttons of ‘yes’ or ‘no’ will open to save edits

![Alt text](IMAGES/2.19.13.png)


Users are prompted to save the edits with a yes or no option.

![Alt text](IMAGES/2.19.14.png)

Step 8: User chooses "Yes" save the edits and newly created child parcels will be saved in the staging table and in transaction.

![Alt text](IMAGES/2.19.15.png)

![Alt text](IMAGES/2.19.16.png)

 ![Alt text](IMAGES/2.19.17.png)   


Step 9: User chooses "No" -> Edit should be discarded and parent parcel should be restored in original form without any split.
Parent Parcel is marked and split task is about to start in below screen

![Alt text](IMAGES/2.19.18.png)

Now split is performed

![Alt text](IMAGES/2.19.19.png)

Tap on the checkbox of split task and then select ‘No’ option in pop up.

### D. Validate topology

- Validate the topology of newly created child parcels after split.

- It checks whether they all have correct boundaries and should not intersect other parcels.


Step 1: Tap on the topology task button

![Alt text](IMAGES/2.81.png)

After the topology task button is tapped, the map will zoom to  edit extent.

![Alt text](IMAGES/2.82.png)

and Validate topology layer is turned on

![Alt text](IMAGES/2.83.png)

Step 2: Topology layer is not checked in the below screen, now when the user taps on the topology task button this layer should be turned on.

![Alt text](IMAGES/2.84miss.png)

![Alt text](IMAGES/2.84.png)

Step 3:
When the user taps on the topology task button -> Validate topology layer is still turned on. (Prerequisite: Ensure that topology layer is already turned on, checkbox is checked before user taps on topology task button)

Here the checkbox of the topology layer is checked on in the below screen before tapping on the topology task.

![Alt text](IMAGES/2.85.png)

Topology layer is still turned on

![Alt text](IMAGES/2.86.png)

![Alt text](IMAGES/2.87.png)


Step 4: Workflow task: For validating configured topology in Parcel Sync.

![Alt text](IMAGES/2.88.png)

![Alt text](IMAGES/2.89.png)

![Alt text](IMAGES/2.90.png)


Step 5: Topology exception case: In this case, the user gets an error and should be able to mark it as an exception and then should be able to proceed and this exception should get bypassed in the topology validation.

![Alt text](IMAGES/2.91.png)

Now these 2 errors should be bypassed in topology validation.


Step 6: 
After validating the topology user should get proper expected error in the error inspector window.

![Alt text](IMAGES/2.92.png)



Step 7: User checks the checkbox of Topology task: Alert user that errors still exist and ask for confirmation to proceed (Yes/No)

![Alt text](IMAGES/2.93.png)


Step 8: Validate Topology layer will be turned off. Steps: User selects "Yes" in confirmation message.

![Alt text](IMAGES/2.94.png)

![Alt text](IMAGES/2.95.png)


Step 9: Validate User will be able to proceed to the next task in transaction even if Validation errors of topology are not fixed. Steps: User selects "Yes" in confirmation message.

![Alt text](IMAGES/2.9miss1.png)

![Alt text](IMAGES/2.9miss2.png)

### E. Attributer - Load transaction and parcel type specific fields in the attributer

Step 1: Open Attributer screen: User should be able to see the parcel specific information in the Attributer screen.

![Alt text](IMAGES/2.12.1.png)

![Alt text](IMAGES/2.12.2.png)

![Alt text](IMAGES/2.12.3.png)

![Alt text](IMAGES/2.12.4.png)


Step 2: Ensure by Default label color is black in the Attributer form.

![Alt text](IMAGES/2.12.5.png)

![Alt text](IMAGES/2.12.6.png)

Step 3: Ensure label color is Red when values are changed.

![Alt text](IMAGES/2.12.7.png)


Now if we fetch values by a helper tool or manually enter the label color should be red.

![Alt text](IMAGES/2.12.8.png)

Step 4: Ensure user is not able to save and proceed if any Asterisks (required) marked field is not having any value and see relevant error message.

![Alt text](IMAGES/2.12.9.png)

Tap on the update icon.

![Alt text](IMAGES/2.12.10.png)

Tap on Yes in the confirmation message

![Alt text](IMAGES/2.12.11.png)


Step 5: Enter information in one child/adhoc parcel and try to switch to another child/adhoc parcel in the list, in this case ensure the user is prompted with a relevant warning message with yes and no options.

![Alt text](IMAGES/2.12.12.png)

We entered 2 values in the Child parcel and now we will switch to an Adhoc parcel.

![Alt text](IMAGES/2.12.13.png)

Step 6: If the user taps on "Yes" in the warning message then don't save the information entered and switch to the selected child/adhoc parcel in the list.

![Alt text](IMAGES/2.12.14.png)

Now tap on another Unkeyed under the Child heading.
![Alt text](IMAGES/2.12.15.png)

Tap on Yes option, we should get switched to another Unkeyed Parcel under Child heading and the data entered for 1st Unkeyed should not be saved.

Got switched to 2nd unkeyed.

![Alt text](IMAGES/2.12.16.png)

Data not saved in the 1st unkeyed.

![Alt text](IMAGES/2.12.17.png)


Step 7: If user taps on "No" in warning message then retain the information entered and stay on attributer form of initial child/adhoc parcel in list.

![Alt text](IMAGES/2.12.18.png)

Now switch to a child unkeyed parcel.
![Alt text](IMAGES/2.12.21.png)

Tap on the “No” option, We should stay at Adhoc parcel and with entered values retained.

![Alt text](IMAGES/2.12.22.png)

This is a defect attributer of Adhoc is displayed but we got switched to Unkeyed Parcel of Child.

Expected Result is when the user taps on the “No” option, We should stay at selected Adhoc parcel and with entered values retained.


Step 8: Some fields should be read only and the user should not be able to edit them.

![Alt text](IMAGES/2.12.23.png)


Step 9: Collection of helper tools should be there in Attributer form.

![Alt text](IMAGES/2.12.24.png)

![Alt text](IMAGES/2.12.25.png)

Step 10: Ensure on tap of the Parent icon it shows list of "inheritable" fields and On click of Use Value button, values are populated from popup to attributer screen.

![Alt text](IMAGES/2.12.26.png)

Tap Parent icon

![Alt text](IMAGES/2.12.27.png)

Tap Use Values and Close button.

![Alt text](IMAGES/2.12.28.png)


Step 11:
Ensure Previous icon is used to copy values from previous parcel attributed. The Previous icon will be disabled for the first parcel attribute and will enable when the user attributes second or more parcels. Inheritable values keyed for the first parcel will be populated on the current attributer form.

Step 12:
Ensure Load deed data icon will help to populate fields DeedSync related fields.
NA this functionality is not implemented currently.

![Alt text](IMAGES/2.12.29.png)

![Alt text](IMAGES/2.12.30.png)

### F. Task - Attribute parcel(s) with save and cancel

- Open attribute form for the child parcels and/or ad-hoc parcels to enter parcel specific information. The attributer form will also show all fields after selecting the child heading label and values entered in this form will be applicable for all child parcels under the child parcels category.

- Select one child/ad-hoc parcel to enter parcel information.

- The heading Child and Ad-hoc will show the number of attributed parcels out of total number of parcels like Child (5/10) meaning 5 child parcels are attributed out of 10, and Ad-hoc (2/7) meaning 2 ad-hoc parcels are attributed out of 7.

- For successfully attributed child parcels, the unkeyed label should be changed to  Display key in the child parcels list. 

- Clear icon: Clear icon will remove all the fields information entered in the Attributer form. First after clicking this icon it will show a pop up box with two buttons Yes and No . Click the Yes icon if you want to remove the fields information of attribute form otherwise press No button. 
                     
- Load Deed Data icon:  It populates all fields related to  DeedSync. 

- Parent icon : It shows list of "inheritable" fields and on click of Use Value button, values are populated from popup to attributer screen. 

- Previous icon : Used to copy values from previous parcels attributed. 

- "Update" icon : Used to save the changes to the database. This will typically update the parcel record with the new attribute values.


- “Close" icon : Used to discard the changes and return to the original parcel record. This will typically not update the database with any changes.

### G. Attributer Helper tool- Parent Parcel Selector

- Tap on the Parent Parcel Selector helper tool next to the Parent Parcel REID field in the attributer form.

- Then one pop up will open containing the list of parent parcels 

- Double click on one of the parent parcel in pop up - Ensure selected parent parcel will be highlighted on the map.

- Pick the REID value from the 1 parent parcel and populate it in the field.

- Tap on Cancel button or close icon in parent parcel list pop up

- Tap on the Choose Parcel button.

### H. Attributer Helper tool - Parcel PK generator 

The parcel PK is an internal system parcel ID. This helper tool is  applicable to new child parcels and ad-hoc parcels also.

- Tab on the helper tool next to the Parcel PK (CAMA Key) and generate a unique ID which is called Parcel PK.

 ![Alt text](IMAGES/2.10.1.png)               

  Fig: Before tapping  Parcel PK (CAMA Key) helper tool,  the field will show blank value

![Alt text](IMAGES/2.10.2.png)

  Fig:  After tapping  Parcel PK (CAMA Key) helper tool the, it will generate the value and show it in the CAMA Key field


- CAMA Key(Parcel PK)  is a required field and a relevant error message will be shown if the value is not present for the Parcel PK field and the user tries to save the attributer form. 

 ![Alt text](IMAGES/2.10.3.png)      

### I. Attributer - Copy values from previous edit on the attributer 

- It provides a feature to copy values from common fields on previous parcel attributes. 

- It helps to avoid entering the same values multiple times on different parcels and  can edit copied values if desired.

Step 1: By default, destination fields will not be having any value. Note: Destination fields means which have a copy attribute helper tool placed next to them, and where the values from source fields will be copied and inputted on tap of the helper tool. Source fields means from where the values will be copied.

Destination field: Deeded Acreage not having any value by default.


![Alt text](IMAGES/2.96.png)



Step 2: Validate copy attribute helper tool is available beside the destination fields.

![Alt text](IMAGES/2.97.png)


Step 3: Validate when user taps on copy attribute helper tool, user will see multiple attribute source fields values copied into single destination field. (Prerequisite: Values should be present in source fields)

![Alt text](IMAGES/2.98.png)

Now tap on Deeded Acreage copy attribute helper tool we should get a combination of values from CAMA Key and Calculated Acreage.

![Alt text](IMAGES/2.991.png)


Step 4: Validate when user taps on copy attribute helper tool, user will see default destination field value. (Prerequisite: No values present in source fields)

Default value of Deeded Acreage as set in Config.

![Alt text](IMAGES/2.9p1.png)

![Alt text](IMAGES/2.9p2.png)


Source fields CAMA Key and Calculated Acreage are having no values and now the user taps on Deeded Acreage helper tool, default value should come.

![Alt text](IMAGES/2.9p3.png)

Step 5: Validate when user taps on copy attribute helper tool, user will see multiple attribute source fields values copied into single destination field. (Prerequisite: Value should be already present in destination field)

![Alt text](IMAGES/2.9p4.png)


Now tap on helper tools of CAMA key and Calculated Acreage.

![Alt text](IMAGES/2.9p5.png)

Now tap on Deeded Acreage helper tool initial value test_data should be replaced.


Step 6: Ensure saved destination field values in Attributer form are stored in the back-end (database).

Backend screenshot

![Alt text](IMAGES/2.9p7.png)

![Alt text](IMAGES/2.9p8.png)


Step 7:
Attributer form should reflect changes made in the config file for destination fields.

![Alt text](IMAGES/2.9p9.png)

Change Required to true , Editable to False and Record Type to None

![Alt text](IMAGES/2.9p10.png)

Attributer form should reflect these changes

![Alt text](IMAGES/2.9p11.png)

Step 8: Ensure if destination fields are required fields then user will see relevant error message if value not present in destination fields and user tries to save the attributer form.

![Alt text](IMAGES/2.9p12.png)

### J. Attributer - Inherit values from parent parcel/container for attributer

Case- 1
Step 1:  Tab on the Parent icon

![Alt text](IMAGES/2.12.34.png)

A pop up window will appear with inheritable values for certain fields of a parent parcel.

![Alt text](IMAGES/2.12.35.png)

![Alt text](IMAGES/2.12.36.png)


Step 2:  Select the desired values of fields in the pop up.
Tap on the checkbox of the fields to select them.

![Alt text](IMAGES/2.12.38.png)

Step 3: Tap on Use Values and Close button

![Alt text](IMAGES/2.12.38.png)


Step 4: Inherited selected fields from the parent parcel popup will be populated with the values in attributer form for a child parcel.

![Alt text](IMAGES/2.12.37.png)

Case - 2 

Step 1:  Tap on the Parent icon then a pop up window will appear with inheritable values for certain fields of a parent parcel. 

![Alt text](IMAGES/2.12.39.png)


Step 2: Select the desired values of fields in the pop up.
Tap on the checkbox of the fields to select them and then Tap on Use Values button and then tap on Close button.

![Alt text](IMAGES/2.12.40.png)

Step 3: Inherited selected fields from the parent parcel popup will be populated with the values in attributer form for a child parcel.

![Alt text](IMAGES/2.12.41.png)


Case - 3

Step 1: Open pop up, do some operation or don't do any operation.
          Tap on the Close button without doing any selection.

![Alt text](IMAGES/2.12.42.png)



Step 2:  Then the below attributer form for a child parcel will open


![Alt text](IMAGES/2.12.43.png)

![Alt text](IMAGES/2.12.44.png)



Step 3: All Adhoc Parcels will have the Parent icon disabled.
![Alt text](IMAGES/2.12.46.png)

### K. - The parcel PK is an internal system parcel ID. This helper tool is  applicable to new child parcels and ad-hoc parcels also.

- Tab on the helper tool next to the Parcel PK (CAMA Key) and generate a unique ID which is called Parcel PK.

 ![Alt text](IMAGES/2.10.1.png)               

  Fig: Before tapping  Parcel PK (CAMA Key) helper tool,  the field will show blank value

![Alt text](IMAGES/2.10.2.png)

  Fig:  After tapping  Parcel PK (CAMA Key) helper tool the, it will generate the value and show it in the CAMA Key field


- CAMA Key(Parcel PK)  is a required field and a relevant error message will be shown if the value is not present for the Parcel PK field and the user tries to save the attributer form. 

 ![Alt text](IMAGES/2.10.3.png)      

### L. Attributer Helper tool – REID generator 

- A REID is a unique identifier used to identify real estate properties for various purposes, such as property tax assessments, zoning, and land use planning. A REID can be generated based on attributes such as the property's location, owner, and other relevant details.

- This helper tool is available for new child parcels and ad-hoc parcels.

- Tap on the REID Helper tool  present in the right side of the Real Estate ID field to generate a valid REID key.

![Alt text](IMAGES/2.11.1.png)
              
Fig: Before tapping REID helper tool field will show blank value

![Alt text](IMAGES/2.11.2.png)

Fig:  After tapping REID helper tool the, it will generate the value and show it in the Real Estate ID field (Prerequisite: CAMA Key and PIN are already generated)

- REID will be a required field and a relevant error message will be shown if the value is not present for the REID field and the user tries to save the attributer form.

![Alt text](IMAGES/2.11.3.png)
          
### M. Attributer Helper tool – Pin calculator

- This helper tool is available for all new child parcels and ad-hoc parcels.

- Tab on the Pin Calculator helper tool. It will calculate the 10-digit Pin from the centroid of the parcel.(See Fig- 2)

 ![Alt text](IMAGES/2.12.31.png)           
        
 
Fig 1:  By default, the Pin calculator field will not be having any value.

![Alt text](IMAGES/2.12.32.png)

                  
Fig 2:  After tapping Pin Calculator helper tool, it will generate the value and show it in the NCPin field 

- Pin calculator field is a required field and a relevant error message will be shown  if the value is not present for the Pin calculator field and the user tries to save the attributer form. 

### N. Load lookup values in a drop-down on attributer form

Click drop down fields in the attributer form. It will load values from GIS or CAMA. 
 
![Alt text](IMAGES/2.15.1.png)

![Alt text](IMAGES/2.15.2.png)   

![Alt text](IMAGES/2.15.4.png)


First It will look at the GIS  and if the lookup type matches it shows values from GIS, otherwise it calls CAMA to provide a list of lookup values. The values have two parts: Value and Description. The description is displayed to the user whereas Value is saved.

### O. Attributer Helper tool- Calculated Acreage    

This helper tool is available for all new child parcels and ad-hoc parcels.

Tab on the Calculated Acreage  helper tool. It will calculate  parcel size in acreage and show acreage value  in the field.              

 Calculated Acreage  field is a required field and a relevant error message will be shown  if the value is not present for the Calculated Acreage  field and the user tries to save the attributer form. 

### P. Attributer Helper tool- Copy Attribute Value

   It provides a feature to copy values from common fields on previous parcel attributes. 

It helps to avoid entering the same values multiple times on different parcels and  can edit copied values if desired.

Step 1: By default, destination fields will not be having any value. Note: Destination fields means which have a copy attribute helper tool placed next to them, and where the values from source fields will be copied and inputted on tap of the helper tool. Source fields means from where the values will be copied.

Destination field: Deeded Acreage not having any value by default.




Step 2: Validate copy attribute helper tool is available beside the destination fields.



Step 3: Validate when user taps on copy attribute helper tool, user will see multiple attribute source fields values copied into single destination field. (Prerequisite: Values should be present in source fields)



Now tap on Deeded Acreage copy attribute helper tool we should get a combination of values from CAMA Key and Calculated Acreage.



Step 4: Validate when user taps on copy attribute helper tool, user will see default destination field value. (Prerequisite: No values present in source fields)

Default value of Deeded Acreage as set in Config.



Source fields CAMA Key and Calculated Acreage are having no values and now the user taps on Deeded Acreage helper tool, default value should come.


Step 5: Validate when user taps on copy attribute helper tool, user will see multiple attribute source fields values copied into single destination field. (Prerequisite: Value should be already present in destination field)



Now tap on helper tools of CAMA key and Calculated Acreage.


Now tap on Deeded Acreage helper tool initial value test_data should be replaced.


Step 6: Ensure saved destination field values in Attributer form are stored in the back-end (database).

Backend screenshot



Step 7:
Attributer form should reflect changes made in the config file for destination fields.

Change Required to true , Editable to False and Record Type to None

Attributer form should reflect these changes


Step 8: Ensure if destination fields are required fields then user will see relevant error message if value not present in destination fields and user tries to save the attributer form.


### Q. Attributer Helper tool- Map Scale/Generic Overlay Helper Tool

Map Scale is a required field and a relevant error message will display if the value is not present for the Map Scale field and the user tries to save the attributer form. 

Step 1: By default, the Map Scale field will not be having any value.


Step 2: Ensure the Map Scale field has a Helper tool enabled next to it.



Step 3: Ensure a helper tool is available for both child parcel and adhoc parcel.


Step 4:  Validate Map Scale value is generated for each child parcel, once the user taps on the helper tool, based on the configuration. 

Calculation logic of CAMA Map Scale highlighted in below screenshot of attributer JSON.



Step 5: Ensure Map Scale will be a required field and user will see relevant error message if value not present for Map Scale field and user tries to save the attributer form.







Step 6: Map Scale should be a non-editable field and user should not be able to manually enter any value.



Step 7: Ensure saved Map Scale value in Attributer form is stored in the backend (database).



Tap on Update icon



Tap on Yes


### R. Task - Perform overlay calculations

Step 1: Tap on the Overlay task button -> Overlay Analysis popup should open.

Defect: PIN and its value is coming two times in Overlay Pop up.

![Alt text](IMAGES/O1.png)

Step 2: Overlay pop up - Steps: Tap on Run Analysis button.

Overlay task should capture additional parcel information from other layers, such as overlapping jurisdictions, zoning, soil etc based on config and results should be generated for all child parcels of the transaction.

Defect: 

1. By Default the first parcel should be displayed as selected in the Overlay pop up.

2. Zoning tab and other tabs showing information should have a column like Parcel PK so that users can see the difference in which particular parcel information they are viewing.

![Alt text](IMAGES/O2.png)

### S. Step 1: Validate there are 3 different types of parcels: Standard, Non-mapped, Container.

Standard Parcel in below screenshot.

Non-Mapped Parcel and Container parcel highlighted below.

![Alt text](IMAGES/2.24.1.png)

![Alt text](IMAGES/2.24.2.png)

Step 2: Container Parcel having links of multiple non-mapped parcels.

![Alt text](IMAGES/2.24.3.png)

Tap on the >> button, a container parcel will have a link of multiple non-mapped parcels.

![Alt text](IMAGES/2.24.4.png)


Step 3: Ensure a non-mapped parcel should have only 1 container at a time.

![Alt text](IMAGES/2.24.5.png)

Step 4: Container parcel is getting split -> Alert user.

![Alt text](IMAGES/2.24.6.png)


Step 5: Container parcel marked as parent -> Alert user.


![Alt text](IMAGES/2.24.7.png)

Step 6: Validate allocate non-mapped parcels task is an optional task and users are able to proceed without allocating non-mapped parcels to any container parcel.

![Alt text](IMAGES/2.24.9.png)


![Alt text](IMAGES/2.24.8.png)


No non-mapped parcel allocated to any of the container parcels in this transaction, still the user should be able to proceed to the next task.

![Alt text](IMAGES/2.24.10.png)


Step 7: Ensure users will see a relevant message like: "There is no non-mapped parcel in this transaction which needs to be linked to a container parcel" Steps: Tap on Allocate Non-Mapped parcels task button Prerequisite: No non-mapped parcel in the transaction.

![Alt text](IMAGES/2.24.11.png)

![Alt text](IMAGES/2.24.12.png)

## 2.5 Exit the transaction in ParcelSync Pro

Tap on the Suspend/Close button in the tasks list to save the information entered till now in this transaction. 

After clicking the Suspend/Close button, information will be saved and the transaction will be closed.

Tap on “Close Transaction” option and it prompts user to select 'Yes' or 'No' for suspend/close transaction

'Yes' will suspend/close the transaction and 'No' will let the user continue working on the transaction.













