package com.sdds.playground.sandbox.plasma.stards.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdkit.star.designsystem.R as DsR

internal object PlasmaStardsTextFieldVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xs" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextFieldXs,
            "Xs.Default" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextFieldXsDefault,
            "Xs.Error" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextFieldXsError,
            "Xs.OuterLabel" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextFieldXsOuterLabel,
            "Xs.OuterLabel.Default" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextFieldXsOuterLabelDefault,
            "Xs.OuterLabel.Error" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextFieldXsOuterLabelError,
            "S" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextFieldS,
            "S.Default" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextFieldSDefault,
            "S.Error" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextFieldSError,
            "S.OuterLabel" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextFieldSOuterLabel,
            "S.OuterLabel.Default" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextFieldSOuterLabelDefault,
            "S.OuterLabel.Error" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextFieldSOuterLabelError,
            "S.InnerLabel" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextFieldSInnerLabel,
            "S.InnerLabel.Default" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextFieldSInnerLabelDefault,
            "S.InnerLabel.Error" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextFieldSInnerLabelError,
            "M" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextFieldM,
            "M.Default" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextFieldMDefault,
            "M.Error" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextFieldMError,
            "M.OuterLabel" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextFieldMOuterLabel,
            "M.OuterLabel.Default" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextFieldMOuterLabelDefault,
            "M.OuterLabel.Error" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextFieldMOuterLabelError,
            "M.InnerLabel" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextFieldMInnerLabel,
            "M.InnerLabel.Default" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextFieldMInnerLabelDefault,
            "M.InnerLabel.Error" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextFieldMInnerLabelError,
        )
}
