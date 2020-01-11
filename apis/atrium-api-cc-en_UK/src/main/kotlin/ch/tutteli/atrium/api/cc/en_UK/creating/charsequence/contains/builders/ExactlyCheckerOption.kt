@file:Suppress("DEPRECATION" /* TODO remove with 0.10.0 */)
package ch.tutteli.atrium.api.cc.en_UK.creating.charsequence.contains.builders

import ch.tutteli.atrium.api.cc.en_UK.exactly
import ch.tutteli.atrium.domain.builders.creating.charsequence.contains.builders.ExactlyCheckerOptionBase
import ch.tutteli.atrium.domain.creating.charsequence.contains.CharSequenceContains
import ch.tutteli.atrium.domain.creating.charsequence.contains.CharSequenceContains.SearchBehaviour

/**
 * Represents the extension point for another option after a `contains exactly`-check within
 * a sophisticated `contains` assertion building process for [CharSequence].
 *
 * @param T The input type of the search.
 * @param S The search behaviour which should be applied for the input of the search.
 */
@Deprecated("Use pendant from package en_GB; will be removed with 0.10.0", ReplaceWith("ch.tutteli.atrium.api.cc.en_GB.creating.charsequence.contains.builders.ExactlyCheckerOption"))
interface ExactlyCheckerOption<out T : CharSequence, out S : CharSequenceContains.SearchBehaviour>
    : CharSequenceContains.CheckerOption<T, S>

/**
 * Represents the builder of a `contains exactly` check within the fluent API of a sophisticated
 * `contains` assertion for [CharSequence].
 *
 * @param T The input type of the search.
 * @param S The search behaviour which should be applied for the input of the search.
 *
 * @constructor Represents the builder of a `contains exactly` check within the fluent API of a sophisticated
 *   `contains` assertion for [CharSequence].
 * @param times The number which the check will compare against the actual number of times an expected object is
 *   found in the input of the search.
 * @param containsBuilder The previously used [CharSequenceContains.Builder].
 */
@Deprecated("Do not rely on this type; will be made internal with 0.10.0", ReplaceWith("ExactlyCheckerOption"))
open class ExactlyCheckerOptionImpl<out T : CharSequence, out S : SearchBehaviour>(
    times: Int,
    containsBuilder: CharSequenceContains.Builder<T, S>
) : ExactlyCheckerOptionBase<T, S>(
    times,
    containsBuilder,
    nameContainsNotValuesFun(),
    { "${containsBuilder::exactly.name}($it)" }
), ExactlyCheckerOption<T, S>
