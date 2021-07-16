package com.rickclephas.kmp.nativecoroutines.compiler

import com.google.auto.service.AutoService
import org.jetbrains.kotlin.compiler.plugin.AbstractCliOption
import org.jetbrains.kotlin.compiler.plugin.CliOption
import org.jetbrains.kotlin.compiler.plugin.CommandLineProcessor
import org.jetbrains.kotlin.config.CompilerConfiguration

@AutoService(CommandLineProcessor::class)
class KmpNativeCoroutinesCommandLineProcessor: CommandLineProcessor {

    override val pluginId: String = "com.rickclephas.kmp.nativecoroutines"

    override val pluginOptions: Collection<AbstractCliOption> = listOf(
        CliOption(SUFFIX_OPTION_NAME, "string", "suffix used for the generated functions", true)
    )

    override fun processOption(
        option: AbstractCliOption,
        value: String,
        configuration: CompilerConfiguration
    ) = when (option.optionName) {
        SUFFIX_OPTION_NAME -> configuration.put(SUFFIX_KEY, value)
        else -> error("Unexpected config option ${option.optionName}")
    }
}