/*
 * Copyright 2010-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.cli;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@RunWith(JUnit3RunnerWithInners.class)
public class CliTestGenerated extends AbstractCliTest {
    @TestMetadata("compiler/testData/cli/jvm")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Jvm extends AbstractCliTest {
        public void testAllFilesPresentInJvm() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/cli/jvm"), Pattern.compile("^(.+)\\.args$"), TargetBackend.ANY, false);
        }

        @TestMetadata("apiVersion.args")
        public void testApiVersion() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/apiVersion.args");
            doJvmTest(fileName);
        }

        @TestMetadata("apiVersion1.0.args")
        public void testApiVersion1_0() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/apiVersion1.0.args");
            doJvmTest(fileName);
        }

        @TestMetadata("apiVersionAndSinceNewerKotlin.args")
        public void testApiVersionAndSinceNewerKotlin() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/apiVersionAndSinceNewerKotlin.args");
            doJvmTest(fileName);
        }

        @TestMetadata("apiVersionGreaterThanLanguage.args")
        public void testApiVersionGreaterThanLanguage() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/apiVersionGreaterThanLanguage.args");
            doJvmTest(fileName);
        }

        @TestMetadata("apiVersionInvalid.args")
        public void testApiVersionInvalid() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/apiVersionInvalid.args");
            doJvmTest(fileName);
        }

        @TestMetadata("apiVersionLessThanLanguage.args")
        public void testApiVersionLessThanLanguage() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/apiVersionLessThanLanguage.args");
            doJvmTest(fileName);
        }

        @TestMetadata("argumentPassedMultipleTimes.args")
        public void testArgumentPassedMultipleTimes() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/argumentPassedMultipleTimes.args");
            doJvmTest(fileName);
        }

        @TestMetadata("classAndFileClassClash.args")
        public void testClassAndFileClassClash() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/classAndFileClassClash.args");
            doJvmTest(fileName);
        }

        @TestMetadata("classAndOtherFileClassClash.args")
        public void testClassAndOtherFileClassClash() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/classAndOtherFileClassClash.args");
            doJvmTest(fileName);
        }

        @TestMetadata("classAndPartClash.args")
        public void testClassAndPartClash() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/classAndPartClash.args");
            doJvmTest(fileName);
        }

        @TestMetadata("classAndTraitClash.args")
        public void testClassAndTraitClash() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/classAndTraitClash.args");
            doJvmTest(fileName);
        }

        @TestMetadata("classpath.args")
        public void testClasspath() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/classpath.args");
            doJvmTest(fileName);
        }

        @TestMetadata("conflictingOverloads.args")
        public void testConflictingOverloads() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/conflictingOverloads.args");
            doJvmTest(fileName);
        }

        @TestMetadata("coroutinesEnable.args")
        public void testCoroutinesEnable() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/coroutinesEnable.args");
            doJvmTest(fileName);
        }

        @TestMetadata("coroutinesError.args")
        public void testCoroutinesError() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/coroutinesError.args");
            doJvmTest(fileName);
        }

        @TestMetadata("coroutinesErrorAndEnable.args")
        public void testCoroutinesErrorAndEnable() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/coroutinesErrorAndEnable.args");
            doJvmTest(fileName);
        }

        @TestMetadata("coroutinesWarn.args")
        public void testCoroutinesWarn() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/coroutinesWarn.args");
            doJvmTest(fileName);
        }

        @TestMetadata("diagnosticsOrder.args")
        public void testDiagnosticsOrder() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/diagnosticsOrder.args");
            doJvmTest(fileName);
        }

        @TestMetadata("duplicateSources.args")
        public void testDuplicateSources() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/duplicateSources.args");
            doJvmTest(fileName);
        }

        @TestMetadata("duplicateSourcesInModule.args")
        public void testDuplicateSourcesInModule() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/duplicateSourcesInModule.args");
            doJvmTest(fileName);
        }

        @TestMetadata("emptySources.args")
        public void testEmptySources() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/emptySources.args");
            doJvmTest(fileName);
        }

        @TestMetadata("extraArgumentPassedInObsoleteForm.args")
        public void testExtraArgumentPassedInObsoleteForm() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/extraArgumentPassedInObsoleteForm.args");
            doJvmTest(fileName);
        }

        @TestMetadata("extraHelp.args")
        public void testExtraHelp() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/extraHelp.args");
            doJvmTest(fileName);
        }

        @TestMetadata("fileClassAndMultifileClassClash.args")
        public void testFileClassAndMultifileClassClash() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/fileClassAndMultifileClassClash.args");
            doJvmTest(fileName);
        }

        @TestMetadata("fileClassAndTImplClash.args")
        public void testFileClassAndTImplClash() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/fileClassAndTImplClash.args");
            doJvmTest(fileName);
        }

        @TestMetadata("fileClassClashMultipleFiles.args")
        public void testFileClassClashMultipleFiles() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/fileClassClashMultipleFiles.args");
            doJvmTest(fileName);
        }

        @TestMetadata("help.args")
        public void testHelp() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/help.args");
            doJvmTest(fileName);
        }

        @TestMetadata("inlineCycle.args")
        public void testInlineCycle() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/inlineCycle.args");
            doJvmTest(fileName);
        }

        @TestMetadata("javaSrcWrongPackage.args")
        public void testJavaSrcWrongPackage() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/javaSrcWrongPackage.args");
            doJvmTest(fileName);
        }

        @TestMetadata("jdkPathDoesNotExist.args")
        public void testJdkPathDoesNotExist() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/jdkPathDoesNotExist.args");
            doJvmTest(fileName);
        }

        @TestMetadata("jvm8Target.args")
        public void testJvm8Target() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/jvm8Target.args");
            doJvmTest(fileName);
        }

        @TestMetadata("kotlinHomeWithoutStdlib.args")
        public void testKotlinHomeWithoutStdlib() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/kotlinHomeWithoutStdlib.args");
            doJvmTest(fileName);
        }

        @TestMetadata("kotlinPackage.args")
        public void testKotlinPackage() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/kotlinPackage.args");
            doJvmTest(fileName);
        }

        @TestMetadata("languageVersion.args")
        public void testLanguageVersion() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/languageVersion.args");
            doJvmTest(fileName);
        }

        @TestMetadata("languageVersionInvalid.args")
        public void testLanguageVersionInvalid() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/languageVersionInvalid.args");
            doJvmTest(fileName);
        }

        @TestMetadata("multipleTextRangesInDiagnosticsOrder.args")
        public void testMultipleTextRangesInDiagnosticsOrder() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/multipleTextRangesInDiagnosticsOrder.args");
            doJvmTest(fileName);
        }

        @TestMetadata("noReflect.args")
        public void testNoReflect() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/noReflect.args");
            doJvmTest(fileName);
        }

        @TestMetadata("noStdlib.args")
        public void testNoStdlib() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/noStdlib.args");
            doJvmTest(fileName);
        }

        @TestMetadata("nonExistingClassPathAndAnnotationsPath.args")
        public void testNonExistingClassPathAndAnnotationsPath() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/nonExistingClassPathAndAnnotationsPath.args");
            doJvmTest(fileName);
        }

        @TestMetadata("nonExistingSourcePath.args")
        public void testNonExistingSourcePath() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/nonExistingSourcePath.args");
            doJvmTest(fileName);
        }

        @TestMetadata("nonLocalDisabled.args")
        public void testNonLocalDisabled() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/nonLocalDisabled.args");
            doJvmTest(fileName);
        }

        @TestMetadata("nonexistentPathInModule.args")
        public void testNonexistentPathInModule() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/nonexistentPathInModule.args");
            doJvmTest(fileName);
        }

        @TestMetadata("nonexistentScript.args")
        public void testNonexistentScript() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/nonexistentScript.args");
            doJvmTest(fileName);
        }

        @TestMetadata("pluginSimple.args")
        public void testPluginSimple() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/pluginSimple.args");
            doJvmTest(fileName);
        }

        @TestMetadata("pluginSimpleUsage.args")
        public void testPluginSimpleUsage() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/pluginSimpleUsage.args");
            doJvmTest(fileName);
        }

        @TestMetadata("returnAsWhenKey.args")
        public void testReturnAsWhenKey() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/returnAsWhenKey.args");
            doJvmTest(fileName);
        }

        @TestMetadata("sanitized-name.clash.args")
        public void testSanitized_name_clash() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/sanitized-name.clash.args");
            doJvmTest(fileName);
        }

        @TestMetadata("signatureClash.args")
        public void testSignatureClash() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/signatureClash.args");
            doJvmTest(fileName);
        }

        @TestMetadata("simple.args")
        public void testSimple() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/simple.args");
            doJvmTest(fileName);
        }

        @TestMetadata("singleJavaFileRoots.args")
        public void testSingleJavaFileRoots() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/singleJavaFileRoots.args");
            doJvmTest(fileName);
        }

        @TestMetadata("suppressAllWarningsJvm.args")
        public void testSuppressAllWarningsJvm() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/suppressAllWarningsJvm.args");
            doJvmTest(fileName);
        }

        @TestMetadata("syntheticAccessorForPropertiesSignatureClash.args")
        public void testSyntheticAccessorForPropertiesSignatureClash() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/syntheticAccessorForPropertiesSignatureClash.args");
            doJvmTest(fileName);
        }

        @TestMetadata("syntheticAccessorPropertyAndFunSignatureClash.args")
        public void testSyntheticAccessorPropertyAndFunSignatureClash() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/syntheticAccessorPropertyAndFunSignatureClash.args");
            doJvmTest(fileName);
        }

        @TestMetadata("syntheticAccessorSignatureClash.args")
        public void testSyntheticAccessorSignatureClash() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/syntheticAccessorSignatureClash.args");
            doJvmTest(fileName);
        }

        @TestMetadata("unknownExtraFlags.args")
        public void testUnknownExtraFlags() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/unknownExtraFlags.args");
            doJvmTest(fileName);
        }

        @TestMetadata("unsupportedTypeAlias.args")
        public void testUnsupportedTypeAlias() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/unsupportedTypeAlias.args");
            doJvmTest(fileName);
        }

        @TestMetadata("warningJdkWithNoJdk.args")
        public void testWarningJdkWithNoJdk() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/warningJdkWithNoJdk.args");
            doJvmTest(fileName);
        }

        @TestMetadata("warningsInDummy.args")
        public void testWarningsInDummy() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/warningsInDummy.args");
            doJvmTest(fileName);
        }

        @TestMetadata("wrongAbiVersion.args")
        public void testWrongAbiVersion() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/wrongAbiVersion.args");
            doJvmTest(fileName);
        }

        @TestMetadata("wrongAbiVersionNoErrors.args")
        public void testWrongAbiVersionNoErrors() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/wrongAbiVersionNoErrors.args");
            doJvmTest(fileName);
        }

        @TestMetadata("wrongArgument.args")
        public void testWrongArgument() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/wrongArgument.args");
            doJvmTest(fileName);
        }

        @TestMetadata("wrongJdkPath.args")
        public void testWrongJdkPath() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/wrongJdkPath.args");
            doJvmTest(fileName);
        }

        @TestMetadata("wrongJvmTargetVersion.args")
        public void testWrongJvmTargetVersion() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/wrongJvmTargetVersion.args");
            doJvmTest(fileName);
        }

        @TestMetadata("wrongScriptWithDirectory.args")
        public void testWrongScriptWithDirectory() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/wrongScriptWithDirectory.args");
            doJvmTest(fileName);
        }

        @TestMetadata("wrongScriptWithKtSource.args")
        public void testWrongScriptWithKtSource() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/wrongScriptWithKtSource.args");
            doJvmTest(fileName);
        }

        @TestMetadata("wrongScriptWithNoSource.args")
        public void testWrongScriptWithNoSource() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/jvm/wrongScriptWithNoSource.args");
            doJvmTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/cli/js")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Js extends AbstractCliTest {
        public void testAllFilesPresentInJs() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/cli/js"), Pattern.compile("^(.+)\\.args$"), TargetBackend.ANY, false);
        }

        @TestMetadata("createMetadata.args")
        public void testCreateMetadata() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/js/createMetadata.args");
            doJsTest(fileName);
        }

        @TestMetadata("emptySources.args")
        public void testEmptySources() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/js/emptySources.args");
            doJsTest(fileName);
        }

        @TestMetadata("inlineCycle.args")
        public void testInlineCycle() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/js/inlineCycle.args");
            doJsTest(fileName);
        }

        @TestMetadata("jsExtraHelp.args")
        public void testJsExtraHelp() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/js/jsExtraHelp.args");
            doJsTest(fileName);
        }

        @TestMetadata("jsHelp.args")
        public void testJsHelp() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/js/jsHelp.args");
            doJsTest(fileName);
        }

        @TestMetadata("kotlinHomeWithoutStdlib.args")
        public void testKotlinHomeWithoutStdlib() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/js/kotlinHomeWithoutStdlib.args");
            doJsTest(fileName);
        }

        @TestMetadata("kotlinPackage.args")
        public void testKotlinPackage() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/js/kotlinPackage.args");
            doJsTest(fileName);
        }

        @TestMetadata("languageVersion.args")
        public void testLanguageVersion() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/js/languageVersion.args");
            doJsTest(fileName);
        }

        @TestMetadata("libraryDirNotFound.args")
        public void testLibraryDirNotFound() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/js/libraryDirNotFound.args");
            doJsTest(fileName);
        }

        @TestMetadata("nonExistingKotlinHome.args")
        public void testNonExistingKotlinHome() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/js/nonExistingKotlinHome.args");
            doJsTest(fileName);
        }

        @TestMetadata("nonExistingSourcePath.args")
        public void testNonExistingSourcePath() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/js/nonExistingSourcePath.args");
            doJsTest(fileName);
        }

        @TestMetadata("notValidLibraryDir.args")
        public void testNotValidLibraryDir() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/js/notValidLibraryDir.args");
            doJsTest(fileName);
        }

        @TestMetadata("outputIsDirectory.args")
        public void testOutputIsDirectory() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/js/outputIsDirectory.args");
            doJsTest(fileName);
        }

        @TestMetadata("outputPostfixFileNotFound.args")
        public void testOutputPostfixFileNotFound() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/js/outputPostfixFileNotFound.args");
            doJsTest(fileName);
        }

        @TestMetadata("outputPrefixFileNotFound.args")
        public void testOutputPrefixFileNotFound() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/js/outputPrefixFileNotFound.args");
            doJsTest(fileName);
        }

        @TestMetadata("simple2js.args")
        public void testSimple2js() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/js/simple2js.args");
            doJsTest(fileName);
        }

        @TestMetadata("sourceMap.args")
        public void testSourceMap() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/js/sourceMap.args");
            doJsTest(fileName);
        }

        @TestMetadata("sourceMapCharEscape.args")
        public void testSourceMapCharEscape() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/js/sourceMapCharEscape.args");
            doJsTest(fileName);
        }

        @TestMetadata("sourceMapDuplicateRelativePaths.args")
        public void testSourceMapDuplicateRelativePaths() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/js/sourceMapDuplicateRelativePaths.args");
            doJsTest(fileName);
        }

        @TestMetadata("sourceMapEmbedSources.args")
        public void testSourceMapEmbedSources() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/js/sourceMapEmbedSources.args");
            doJsTest(fileName);
        }

        @TestMetadata("sourceMapPrefix.args")
        public void testSourceMapPrefix() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/js/sourceMapPrefix.args");
            doJsTest(fileName);
        }

        @TestMetadata("sourceMapRootAuto.args")
        public void testSourceMapRootAuto() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/js/sourceMapRootAuto.args");
            doJsTest(fileName);
        }

        @TestMetadata("sourceMapRootManual.args")
        public void testSourceMapRootManual() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/js/sourceMapRootManual.args");
            doJsTest(fileName);
        }

        @TestMetadata("sourceMapRootMissing.args")
        public void testSourceMapRootMissing() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/js/sourceMapRootMissing.args");
            doJsTest(fileName);
        }

        @TestMetadata("sourceMapRootMultiple.args")
        public void testSourceMapRootMultiple() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/js/sourceMapRootMultiple.args");
            doJsTest(fileName);
        }

        @TestMetadata("suppressAllWarningsJS.args")
        public void testSuppressAllWarningsJS() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/js/suppressAllWarningsJS.args");
            doJsTest(fileName);
        }

        @TestMetadata("withFolderAsLib.args")
        public void testWithFolderAsLib() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/js/withFolderAsLib.args");
            doJsTest(fileName);
        }

        @TestMetadata("withLib.args")
        public void testWithLib() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/js/withLib.args");
            doJsTest(fileName);
        }

        @TestMetadata("wrongAbiVersion.args")
        public void testWrongAbiVersion() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/js/wrongAbiVersion.args");
            doJsTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/cli/js-dce")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Js_dce extends AbstractCliTest {
        public void testAllFilesPresentInJs_dce() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/cli/js-dce"), Pattern.compile("^(.+)\\.args$"), TargetBackend.ANY, false);
        }

        @TestMetadata("dceHelp.args")
        public void testDceHelp() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/js-dce/dceHelp.args");
            doJsDceTest(fileName);
        }

        @TestMetadata("emptySources.args")
        public void testEmptySources() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/js-dce/emptySources.args");
            doJsDceTest(fileName);
        }

        @TestMetadata("includeDeclarations.args")
        public void testIncludeDeclarations() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/js-dce/includeDeclarations.args");
            doJsDceTest(fileName);
        }

        @TestMetadata("jsExtraHelp.args")
        public void testJsExtraHelp() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/js-dce/jsExtraHelp.args");
            doJsDceTest(fileName);
        }

        @TestMetadata("nonExistingSourcePath.args")
        public void testNonExistingSourcePath() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/js-dce/nonExistingSourcePath.args");
            doJsDceTest(fileName);
        }

        @TestMetadata("notFile.args")
        public void testNotFile() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/js-dce/notFile.args");
            doJsDceTest(fileName);
        }

        @TestMetadata("outputIsDirectory.args")
        public void testOutputIsDirectory() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/js-dce/outputIsDirectory.args");
            doJsDceTest(fileName);
        }

        @TestMetadata("overrideOutputName.args")
        public void testOverrideOutputName() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/js-dce/overrideOutputName.args");
            doJsDceTest(fileName);
        }

        @TestMetadata("printReachability.args")
        public void testPrintReachability() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/js-dce/printReachability.args");
            doJsDceTest(fileName);
        }

        @TestMetadata("simple.args")
        public void testSimple() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cli/js-dce/simple.args");
            doJsDceTest(fileName);
        }
    }
}
