package com.sdds.playground.sandbox.plasma.stards.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdkit.star.designsystem.R as DsR

internal object PlasmaStardsTextAreaVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xs" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextAreaXs,
            "Xs.Default" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextAreaXsDefault,
            "Xs.Error" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextAreaXsError,
            "Xs.OuterLabel" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextAreaXsOuterLabel,
            "Xs.OuterLabel.Default" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextAreaXsOuterLabelDefault,
            "Xs.OuterLabel.Error" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextAreaXsOuterLabelError,
            "S" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextAreaS,
            "S.Default" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextAreaSDefault,
            "S.Error" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextAreaSError,
            "S.OuterLabel" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextAreaSOuterLabel,
            "S.OuterLabel.Default" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextAreaSOuterLabelDefault,
            "S.OuterLabel.Error" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextAreaSOuterLabelError,
            "S.InnerLabel" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextAreaSInnerLabel,
            "S.InnerLabel.Default" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextAreaSInnerLabelDefault,
            "S.InnerLabel.Error" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextAreaSInnerLabelError,
            "M" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextAreaM,
            "M.Default" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextAreaMDefault,
            "M.Error" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextAreaMError,
            "M.OuterLabel" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextAreaMOuterLabel,
            "M.OuterLabel.Default" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextAreaMOuterLabelDefault,
            "M.OuterLabel.Error" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextAreaMOuterLabelError,
            "M.InnerLabel" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextAreaMInnerLabel,
            "M.InnerLabel.Default" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextAreaMInnerLabelDefault,
            "M.InnerLabel.Error" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextAreaMInnerLabelError,
        )
}
