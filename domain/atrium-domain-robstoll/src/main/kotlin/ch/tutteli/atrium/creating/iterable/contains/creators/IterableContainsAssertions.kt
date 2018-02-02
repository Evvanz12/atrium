package ch.tutteli.atrium.creating.iterable.contains.creators

import ch.tutteli.atrium.assertions.Assertion
import ch.tutteli.atrium.creating.AssertionPlant
import ch.tutteli.atrium.creating.iterable.contains.builders.IterableContainsBuilder
import ch.tutteli.atrium.creating.iterable.contains.builders.IterableContainsCheckerBuilder
import ch.tutteli.atrium.creating.iterable.contains.searchbehaviours.IterableContainsInAnyOrderOnlySearchBehaviour
import ch.tutteli.atrium.creating.iterable.contains.searchbehaviours.IterableContainsInAnyOrderSearchBehaviour
import ch.tutteli.atrium.creating.iterable.contains.searchbehaviours.IterableContainsInOrderOnlySearchBehaviour

/**
 * Robstoll's implementation of [IIterableContainsAssertions].
 */
object IterableContainsAssertions : IIterableContainsAssertions {
    override fun <E, T : Iterable<E>> containsObjectsInAnyOrder(
        checker: IterableContainsCheckerBuilder<E, T, IterableContainsInAnyOrderSearchBehaviour>,
        expected: E,
        otherExpected: Array<out E>
    ): Assertion = _containsObjectsInAnyOrder(checker, expected, otherExpected)

    override fun <E : Any, T : Iterable<E>> containsEntriesInAnyOrder(
        checker: IterableContainsCheckerBuilder<E, T, IterableContainsInAnyOrderSearchBehaviour>,
        assertionCreator: AssertionPlant<E>.() -> Unit,
        otherAssertionCreators: Array<out AssertionPlant<E>.() -> Unit>
    ): Assertion = _containsEntriesInAnyOrder(checker, assertionCreator, otherAssertionCreators)

    override fun <E : Any, T : Iterable<E?>> containsNullableEntriesInAnyOrder(
        checker: IterableContainsCheckerBuilder<E?, T, IterableContainsInAnyOrderSearchBehaviour>,
        assertionCreator: (AssertionPlant<E>.() -> Unit)?,
        otherAssertionCreators: Array<out (AssertionPlant<E>.() -> Unit)?>
    ): Assertion = _containsNullableEntriesInAnyOrder(checker, assertionCreator, otherAssertionCreators)

    override fun <E, T : Iterable<E>> containsObjectsInAnyOrderOnly(
        builder: IterableContainsBuilder<E, T, IterableContainsInAnyOrderOnlySearchBehaviour>,
        expected: E,
        otherExpected: Array<out E>
    ): Assertion = _containsObjectsInAnyOrderOnly(builder, expected, otherExpected)

    override fun <E : Any, T : Iterable<E>> containsEntriesInAnyOrderOnly(
        builder: IterableContainsBuilder<E, T, IterableContainsInAnyOrderOnlySearchBehaviour>,
        assertionCreator: AssertionPlant<E>.() -> Unit,
        otherAssertionCreators: Array<out AssertionPlant<E>.() -> Unit>
    ): Assertion = _containsEntriesInAnyOrderOnly(builder, assertionCreator, otherAssertionCreators)

    override fun <E : Any, T : Iterable<E?>> containsNullableEntriesInAnyOrderOnly(
        builder: IterableContainsBuilder<E?, T, IterableContainsInAnyOrderOnlySearchBehaviour>,
        assertionCreator: (AssertionPlant<E>.() -> Unit)?,
        otherAssertionCreators: Array<out (AssertionPlant<E>.() -> Unit)?>
    ): Assertion = _containsNullableEntriesInAnyOrderOnly(builder, assertionCreator, otherAssertionCreators)

    override fun <E, T : Iterable<E>> containsObjectsInOrderOnly(
        builder: IterableContainsBuilder<E, T, IterableContainsInOrderOnlySearchBehaviour>,
        expected: E,
        otherExpected: Array<out E>
    ): Assertion = _containsObjectsInOrderOnly(builder, expected, otherExpected)

    override fun <E : Any, T : Iterable<E>> containsEntriesInOrderOnly(
        builder: IterableContainsBuilder<E, T, IterableContainsInOrderOnlySearchBehaviour>,
        assertionCreator: AssertionPlant<E>.() -> Unit,
        otherAssertionCreators: Array<out AssertionPlant<E>.() -> Unit>
    ): Assertion = _containsEntriesInOrderOnly(builder, assertionCreator, otherAssertionCreators)

    override fun <E : Any, T : Iterable<E?>> containsNullableEntriesInOrderOnly(
        builder: IterableContainsBuilder<E?, T, IterableContainsInOrderOnlySearchBehaviour>,
        assertionCreator: (AssertionPlant<E>.() -> Unit)?,
        otherAssertionCreators: Array<out (AssertionPlant<E>.() -> Unit)?>
    ): Assertion = _containsNullableEntriesInOrderOnly(builder, assertionCreator, otherAssertionCreators)
}
