package seedu.address.logic.parser;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.logic.commands.CommandTestUtil.assertCommandFailure;
import static seedu.address.testutil.Assert.assertThrows;
import static seedu.address.testutil.TypicalContacts.getTypicalContactList;
import static seedu.address.testutil.TypicalIndexes.INDEX_FIRST_PERSON;
import static seedu.address.testutil.TypicalIndexes.INDEX_SECOND_PERSON;
import static seedu.address.testutil.TypicalPersons.getTypicalAddressBook;

import org.junit.jupiter.api.Test;

import seedu.address.commons.core.Messages;
import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.ClearCommand;
import seedu.address.logic.commands.LinkContactCommand;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;
import seedu.address.model.ModelManager;
import seedu.address.model.UserPrefs;
import seedu.address.model.person.Event;
import seedu.address.testutil.PersonBuilder;

public class LinkContactCommandTest {

    private Model model = new ModelManager(getTypicalAddressBook(), getTypicalContactList(), new UserPrefs());
    private Model expectedModel = new ModelManager(getTypicalAddressBook(), getTypicalContactList(), new UserPrefs());


    @Test
    public void execute_invalidIndexUnfilteredList_throwsCommandException() {
        Index outOfBoundIndex = Index.fromOneBased(expectedModel.getFilteredPersonList().size() + 1);
        LinkContactCommand linkContactCommand = new LinkContactCommand(outOfBoundIndex, "91234567");

        assertCommandFailure(linkContactCommand, model, Messages.MESSAGE_INVALID_EVENT_DISPLAYED_INDEX);
    }

    @Test
    public void execute_contactNotFound_throwsCommandException() {
        Event eventToAddContact = new PersonBuilder().build();
        model.addPerson(eventToAddContact);
        LinkContactCommand linkContactCommand = new LinkContactCommand(INDEX_FIRST_PERSON,
                "99999999"); // phone number that does not exist in contact list
        assertThrows(CommandException.class, () -> linkContactCommand.execute(model));
    }

    @Test
    public void execute_invalidContact_throwsCommandException() throws Exception {
        LinkContactCommand linkContactCommand = new LinkContactCommand(Index.fromOneBased(1), "91234568");

        assertThrows(CommandException.class, () -> linkContactCommand.execute(model));
    }

    @Test
    public void equals() {
        final LinkContactCommand standardCommand = new LinkContactCommand(INDEX_FIRST_PERSON, "91234567");

        // same values -> returns true
        LinkContactCommand commandWithSameValues = new LinkContactCommand(INDEX_FIRST_PERSON, "91234567");
        assertTrue(standardCommand.equals(commandWithSameValues));

        // same object -> returns true
        assertTrue(standardCommand.equals(standardCommand));

        // null -> returns false
        assertFalse(standardCommand.equals(null));

        // different types -> returns false
        assertFalse(standardCommand.equals(new ClearCommand()));

        // different index -> returns false
        assertFalse(standardCommand.equals(new LinkContactCommand(INDEX_SECOND_PERSON, "91234567")));

        // different phone number -> returns false
        assertFalse(standardCommand.equals(new LinkContactCommand(INDEX_SECOND_PERSON, "91234568")));
    }


}