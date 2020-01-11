package ch.tutteli.atrium.api.cc.en_GB.creating.charsequence.contains.builders

import ch.tutteli.atrium.domain.creating.charsequence.contains.CharSequenceContains

/**
 * Represents the extension point for another option after a `contains at least once but at most`-check within
 * a sophisticated `contains` assertion building process for [CharSequence].
 *
 * @param T The input type of the search.
 * @param S The search behaviour which should be applied for the input of the search.
 */
@Deprecated("Switch from api-cc-en_GB to api-fluent-en_GB; will be removed with 0.10.0")
interface AtMostCheckerOption<out T : CharSequence, out S : CharSequenceContains.SearchBehaviour>
    : CharSequenceContains.CheckerOption<T, S>
