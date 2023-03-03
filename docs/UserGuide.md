---
layout: page
title: User Guide for Paidlancers
---

Paidlancers is a **desktop app for keeping track of your freelancing events, optimised for use via a Command Line Interface (CLI)** while still having the benefits of a Graphical User Interface (GUI). If you can type fast, Paidlancers can get your freelancing event management tasks done faster than traditional GUI apps.

## Table of Contents
- [Quick Start](#quick-start)
- [Features](#features)
  * [Add a Contact](#add-a-contact)
  * [View Contact List](#list-all-contacts)
  * [Link Contact to Event](#link-contact-to-event-link)
  * [View Rate](#view-rate-rate)
  * [Tag Rate](#tag-rate-newrate)
  * [Mark Event as Done](#mark-event-as-done-mark)
  * [Create New Event](#create-new-event-newevent)
  * [View Event List](#list-all-events-listevent)
  * [Delete an Event](#delete-an-event-deleteevent)
  * [Add Date to Event](#add-date-to-an-event-adddate)
- [FAQ](#faq)
- [Command Summary](#command-summary)

--------------------------------------------------------------------------------------------------------------------

## Quick start

1. Ensure you have Java `11` or above installed in your Computer.

1. Download the latest `Paidlancers.jar` from [here](https://github.com/AY2223S2-CS2103T-T11-3/tp/releases).

1. Copy the file to the folder you want to use as the _home folder_ for your AddressBook.

1. Open a command terminal, `cd` into the folder you put the jar file in, and use the `java -jar Paidlancers.jar` command to run the application.<br>
   A GUI similar to the below should appear in a few seconds. Note how the app contains some sample data.<br>
   ![Ui](images/Ui.png)

1. Type the command in the command box and press Enter to execute it.
   Some example commands you can try:

   * `listcontact` : Lists all contacts.

   * `newcontact n/John Doe p/98765432` : Adds a contact named `John Doe` to the contact list.

   * `deleteevent 3` : Deletes the 3rd event shown in the current list.

1. Refer to the [Features](#features) below for details of each command.

--------------------------------------------------------------------------------------------------------------------

## Features

### Add a Contact: `newcontact` <a id = "add-a-contact"></a>

Adding a contact to contacts

**Format**: `newcontact n/NAME p/NUMBER`

- Creates a new contact with specified `NAME` and `NUMBER`


**Example**:
- `newcontact n/Deborah Tan p/91234567`
- `newcontact n/Mandy p/98765432`


### List all Contacts: `listcontact` <a id = "list-all-contacts"></a>

Displays all contacts saved in a list

**Format**: `listcontact`

### Link Contact to Event: `link`

Links client contact to an event.

**Format**: `link INDEX CONTACT`

- Links contact to the event at the specified `INDEX`.

  - The `INDEX` refers to the index number in the displayed events list.
  - The `INDEX` must be a positive integer 1, 2, 3, …​

**Example**:
- `link 2 91234567` links `2nd event` to contact `91234567` in the list.


### View Rate: `rate`

Displays the rate tagged to an event.

**Format**: `rate INDEX`

- Displays the agreed rate of the event at the specified `INDEX`.

  - The `INDEX` refers to the index number in the displayed events list.
  - The `INDEX` must be a positive integer 1, 2, 3, …​

**Example**: 
- `rate 2` returns the rate of `2nd event` in the event list.


### Tag Rate: `newrate`

Tags a rate to an event.

**Format**: `newrate INDEX AMOUNT`

- Adds a specified rate, `AMOUNT`, to an event at the specified `INDEX`.

  - The `INDEX` refers to the index number in the displayed events list.
  - The `INDEX` must be a positive integer 1, 2, 3, …​

**Example**: 
- `newrate 2 100` adds the rate of `100` to the `2nd event` in the event list.


### Mark Event as Done: `mark`

Marks a specified event in the address book as done. 

**Format**: `mark INDEX`  

- Marks the event at the specified `INDEX` as done. 

The event must not be marked as done beforehand.  

**Example**:  
- `mark 2` marks the `2nd event` as done.

### Create new Event: `newevent`

Creates a new event  

**Format**: `newevent NAME`  

- Creates a new event with the specified event `NAME` 

**Example**: 
- `newevent Singing` creates an event that has the name “Singing”.

### List all Events: `listevent`

Shows a list of all events in the address book

**Format**: `listevent`


### Delete an Event: `deleteevent`

Deletes the specified event from the event book.

**Format**: `deleteevent INDEX`

- Deletes the event at the specified INDEX
  - The `INDEX` refers to the index number shown in the displayed event list.
  - The `INDEX` must be a positive integer 1, 2, 3, …​
  
**Example**:
  - `deleteevent 2` deletes the `2nd event` in the event list.

### Add Date to an Event: `adddate`

Adds a starting time and ending time to the specified event in the event book.

**Format**: `adddate INDEX /from dd/MM/yy /to dd/MM/yy`

 - Adds starting and ending time to the event at the specified INDEX
    - The `INDEX` refers to the index number shown in the displayed event list.
    - The `INDEX` must be a positive integer 1, 2, 3, …​
  
**Example**:
- `adddate 2 /from 03/03/03 /to 04/03/03`
  
The event must not have time associated with it beforehand.

### Saving the data

Paidlancer data are saved in the hard disk automatically exiting the program. There is no need to save manually.

## FAQ

**Q**: How do I transfer my data to another Computer?  
**A**: Install the app in the other computer and overwrite the empty data file it creates with the file that contains the data of your previous Paidlancers home folder.

## Command Summary
|                        Commands                        |               Command Format                |                                Example Usage                                |
|:------------------------------------------------------:|:-------------------------------------------:|:---------------------------------------------------------------------------:|
|      [Add a Contact](#add-a-contact--newcontact)       |        `newcontact n/NAME p/NUMBER`         |                    `newcontact n/Deborah Tan p/91234567`                    |
| [Listing All Contact](#list-all-contacts--listcontact) |                `listcontact`                |                                `listcontact`                                |
| [Link Contact to Event](#link-contact-to-event--link)  |            `link INDEX CONTACT`             |                              `link 2 91234567`                              |
|             [View Rate](#view-rate--rate)              |                `rate INDEX`                 |                                  `rate 2`                                   |  
|            [Tag a rate](#tag-rate--newrate)            |           `newrate INDEX AMOUNT`            |                               `newrate 2 100`                               |
|    [Marks Event as Done](#mark-event-as-done--mark)    |                `mark INDEX`                 |                                  `mark 2`                                   |
|   [Create a new Event](#create-new-event--newevent)    |               `newevent NAME`               |                             `newevent Singing`                              |
|     [View Event List](#list-all-events--listevent)     |                 `listevent`                 |                                 `listevent`                                 |
|    [Delete an Event](#delete-an-event--deleteevent)    |               `deleteevent 2`               |                               `deleteevent 2`                               |
|  [Add Date to Event](#add-date-to-an-event--adddate)   | `adddate INDEX /from dd/MM/yy /to dd/MM/yy` |                   `adddate 2 /from 03/03/03 /to 04/03/03`                   |

[Back to top](#)
