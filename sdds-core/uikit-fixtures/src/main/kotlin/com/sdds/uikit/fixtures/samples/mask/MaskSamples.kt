package com.sdds.uikit.fixtures.samples.mask

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.docs.codeSnippet
import com.sdds.uikit.TextField
import com.sdds.uikit.TextField.Mask.Date.Companion.MEDIUM
import com.sdds.uikit.fixtures.databinding.SamplesMaskBinding

@DocSample
fun Mask_Phone(context: Context): View {
    val binding = SamplesMaskBinding.inflate(LayoutInflater.from(context))
    return binding.maskPhone.also { maskedTextField ->
        codeSnippet {
            maskedTextField.setMask(
                mask = TextField.Mask.Phone(),
                displayMode = TextField.MASK_DISPLAY_MODE_ON_INPUT,
            )
        }
    }
}

@DocSample
fun Mask_Phone_Always(context: Context): View {
    val binding = SamplesMaskBinding.inflate(LayoutInflater.from(context))
    return binding.maskPhone.also { maskedTextField ->
        codeSnippet {
            maskedTextField.setMask(
                mask = TextField.Mask.Phone(),
                displayMode = TextField.MASK_DISPLAY_MODE_ALWAYS,
            )
        }
    }
}

@DocSample
fun Mask_Phone_CustomFormat(context: Context): View {
    val binding = SamplesMaskBinding.inflate(LayoutInflater.from(context))
    return binding.maskPhone.also { maskedTextField ->
        codeSnippet {
            maskedTextField.setMask(
                TextField.Mask.Phone(prefix = "+1", suffix = "(000) 000-00-00"),
            )
        }
    }
}

@DocSample
fun Mask_Date(context: Context): View {
    val binding = SamplesMaskBinding.inflate(LayoutInflater.from(context))
    return binding.maskDate.also { maskedTextField ->
        codeSnippet {
            maskedTextField.setMask(
                TextField.Mask.Date(
                    format = MEDIUM,
                ),
            )
        }
    }
}

@DocSample
fun Mask_Time(context: Context): View {
    val binding = SamplesMaskBinding.inflate(LayoutInflater.from(context))
    return binding.maskTime.also { maskedTextField ->
        codeSnippet {
            maskedTextField.setMask(
                TextField.Mask.Time,
            )
        }
    }
}

@DocSample
fun Mask_Number(context: Context): View {
    val binding = SamplesMaskBinding.inflate(LayoutInflater.from(context))
    return binding.maskNumber.also { maskedTextField ->
        codeSnippet {
            maskedTextField.setMask(
                TextField.Mask.Number(
                    decimalMinCount = 2,
                    decimalMaxCount = 2,
                ),
            )
        }
    }
}

@DocSample
fun Mask_Custom(context: Context): View {
    val binding = SamplesMaskBinding.inflate(LayoutInflater.from(context))
    return binding.maskCustom.also { maskedTextField ->
        codeSnippet {
            maskedTextField.setMask(
                TextField.Mask.Custom("AA-[0000]"),
            )
        }
    }
}

@DocSample
fun Mask_Disabled(context: Context): View {
    val binding = SamplesMaskBinding.inflate(LayoutInflater.from(context))
    return binding.maskPhone.also { maskedTextField ->
        codeSnippet {
            maskedTextField.setMask(null)
        }
    }
}

@DocSample
fun Mask_Sum_Always_Display(context: Context): View {
    val binding = SamplesMaskBinding.inflate(LayoutInflater.from(context))
    return binding.maskNumber.also { maskedTextField ->
        codeSnippet {
            maskedTextField.setMask(
                TextField.Mask.Number(
                    decimalMinCount = 2,
                    decimalMaxCount = 2,
                ),
            )
            maskedTextField.suffixText = "₽"
            maskedTextField.value = "12345"
        }
    }
}
