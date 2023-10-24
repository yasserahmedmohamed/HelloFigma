import androidx.compose.ui.unit.*
import androidx.compose.ui.graphics.Color
import androidx.core.graphics.toColorInt
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalDensity

object DesignSystem {
    val color = ColorValuesContainer1
    val borderWidth = BorderWidthValuesContainer1
    val borderRadius = BorderRadiusValuesContainer1
    val size = SizeValuesContainer1
    val space = SpaceValuesContainer1
    val opacity = OpacityValuesContainer1
    val typography = TypographyValuesContainer1
    val dimension = DimensionValuesContainer1
    val elevation = ElevationValuesContainer1
    val fontFamily = FontFamilyValuesContainer1
    val fontSize = FontSizeValuesContainer1
    val fontWeight = FontWeightValuesContainer1
    val letterSpacing = LetterSpacingValuesContainer1
    val lineHeight = LineHeightValuesContainer1
}

object ContentValuesContainer {
    val primary = Color("#272e35".toColorInt())
    val secondary = Color("#555f6d".toColorInt())
    val tertiary = Color("#7e8c9a".toColorInt())
    val disabled = Color("#9ea8b3".toColorInt())
    val primaryInverse = Color("#ffffff".toColorInt())
    val secondaryInverse = Color("#ffffffa3".toColorInt())
    val tertiaryInverse = Color("#ffffff66".toColorInt())
    val disabledInverse = Color("#ffffff3d".toColorInt())
    val infoPrimary = Color("#113997".toColorInt())
    val infoSecondary = Color("#3061d5".toColorInt())
    val successPrimary = Color("#135315".toColorInt())
    val successSecondary = Color("#347434".toColorInt())
    val warningPrimary = Color("#7a4510".toColorInt())
    val warningSecondary = Color("#f59638".toColorInt())
    val dangerPrimary = Color("#6f2020".toColorInt())
    val dangerSecondary = Color("#c53434".toColorInt())
    val brandPrimary = Color("#113997".toColorInt())
    val brandSecondary = Color("#3061d5".toColorInt())
}

object BorderValuesContainer {
    val `default` = Color("#eaedf0".toColorInt())
    val defaultA = Color("#10284717".toColorInt())
    val inverse = Color("#ffffff".toColorInt())
    val neutralStrong = Color("#555f6d".toColorInt())
    val neutralSubtle = Color("#cfd6dd".toColorInt())
    val infoStrong = Color("#3061d5".toColorInt())
    val infoSubtle = Color("#ccdcff".toColorInt())
    val successStrong = Color("#347434".toColorInt())
    val successSubtle = Color("#c6ecc6".toColorInt())
    val warningStrong = Color("#f59638".toColorInt())
    val warningSubtle = Color("#ffd4a8".toColorInt())
    val dangerStrong = Color("#c53434".toColorInt())
    val dangerSubtle = Color("#fccfcf".toColorInt())
}

object BackgroundValuesContainer {
    val `default` = Color("#ffffff".toColorInt())
    val inverse = Color("#272e35".toColorInt())
    val neutralStrong = Color("#555f6d".toColorInt())
    val neutralMuted = Color("#dee3e7".toColorInt())
    val neutralOnSubtle = Color("#eaedf0".toColorInt())
    val neutralSubtle = Color("#f5f7f9".toColorInt())
    val neutralSurface = Color("#fcfcfd".toColorInt())
    val infoStrong = Color("#3061d5".toColorInt())
    val infoMuted = Color("#d6e3ff".toColorInt())
    val infoOnSubtle = Color("#e5eeff".toColorInt())
    val infoSubtle = Color("#f5f8ff".toColorInt())
    val infoSurface = Color("#fafbff".toColorInt())
    val successStrong = Color("#347434".toColorInt())
    val successMuted = Color("#cff2cf".toColorInt())
    val successOnSubtle = Color("#dff6df".toColorInt())
    val successSubtle = Color("#f4fbf4".toColorInt())
    val successSurface = Color("#fbfefb".toColorInt())
    val warningStrong = Color("#f59638".toColorInt())
    val warningMuted = Color("#fcdec0".toColorInt())
    val warningOnSubtle = Color("#ffe8d1".toColorInt())
    val warningSubtle = Color("#fff5eb".toColorInt())
    val warningSurface = Color("#fffcfa".toColorInt())
    val dangerStrong = Color("#c53434".toColorInt())
    val dangerMuted = Color("#fcd9d9".toColorInt())
    val dangerOnSubtle = Color("#fee7e7".toColorInt())
    val dangerSubtle = Color("#fef5f5".toColorInt())
    val dangerSurface = Color("#fffafa".toColorInt())
    val brandStrong = Color("#3061d5".toColorInt())
    val brandMuted = Color("#d6e3ff".toColorInt())
    val brandOnSubtle = Color("#e5eeff".toColorInt())
    val brandSurface = Color("#fafbff".toColorInt())
    val brandSubtle = Color("#f5f8ff".toColorInt())
}

object PrimaryValuesContainer {
    val actionPrimaryNormal = Color("#3061d5".toColorInt())
    val actionPrimaryHover = Color("#1e4fc2".toColorInt())
    val actionPrimaryActive = Color("#113997".toColorInt())
    val actionPrimarySelected = Color("#1e4fc2".toColorInt())
    val actionPrimarySubtleNormal = Color("#ebf0ff".toColorInt())
    val actionPrimarySubtleHover = Color("#e5eeff".toColorInt())
    val actionPrimarySubtleActive = Color("#ccdcff".toColorInt())
    val actionPrimarySubtleSelected = Color("#e5eeff".toColorInt())
}

object NeutralValuesContainer {
    val actionNeutralNormal = Color("#4a545e".toColorInt())
    val actionNeutralHover = Color("#3a424a".toColorInt())
    val actionNeutralActive = Color("#272e35".toColorInt())
    val actionNeutralSelected = Color("#3a424a".toColorInt())
    val actionNeutralSubtleNormal = Color("#f0f3f5".toColorInt())
    val actionNeutralSubtleHover = Color("#eaedf0".toColorInt())
    val actionNeutralSubtleActive = Color("#cfd6dd".toColorInt())
    val actionNeutralSubtleSelected = Color("#eaedf0".toColorInt())
}

object SuccessValuesContainer {
    val actionSuccessNormal = Color("#347434".toColorInt())
    val actionSuccessHover = Color("#246626".toColorInt())
    val actionSuccessActive = Color("#135315".toColorInt())
    val actionSuccessSelected = Color("#246626".toColorInt())
    val actionSuccessSubtleNormal = Color("#e6f9e6".toColorInt())
    val actionSuccessSubtleHover = Color("#dff6df".toColorInt())
    val actionSuccessSubtleActive = Color("#c6ecc6".toColorInt())
    val actionSuccessSubtleSelected = Color("#dff6df".toColorInt())
}

object DangerValuesContainer {
    val actionDangerNormal = Color("#c53434".toColorInt())
    val actionDangerHover = Color("#952d2d".toColorInt())
    val actionDangerActive = Color("#6f2020".toColorInt())
    val actionDangerSelected = Color("#952d2d".toColorInt())
    val actionDangerSubtleNormal = Color("#ffebeb".toColorInt())
    val actionDangerSubtleHover = Color("#fee7e7".toColorInt())
    val actionDangerSubtleActive = Color("#fccfcf".toColorInt())
    val actionDangerSubtleSelected = Color("#fee7e7".toColorInt())
}

object GhostValuesContainer {
    val actionGhostNormal = Color("#ffffff00".toColorInt())
    val actionGhostHover = Color("#022e500f".toColorInt())
    val actionGhostActive = Color("#10284717".toColorInt())
    val actionGhostSelected = Color("#022e500f".toColorInt())
    val actionGhostInverseHover = Color("#ffffff1a".toColorInt())
    val actionGhostInverseActive = Color("#ffffff1f".toColorInt())
    val actionGhostInverseSelected = Color("#ffffff1a".toColorInt())
    val actionGhostDangerHover = Color("#ffebeb".toColorInt())
    val actionGhostDangerActive = Color("#fee7e7".toColorInt())
    val actionGhostDangerSelected = Color("#ffebeb".toColorInt())
}

object OutlineValuesContainer {
    val actionOutlineNormal = Color("#cfd6dd".toColorInt())
    val actionOutlineHover = Color("#9ea8b3".toColorInt())
    val actionOutlineActive = Color("#7e8c9a".toColorInt())
    val actionOutlineSelected = Color("#9ea8b3".toColorInt())
}

object InverseValuesContainer {
    val actionInverseNormal = Color("#ffffff".toColorInt())
    val actionInverseHover = Color("#ffffffd1".toColorInt())
    val actionInverseActive = Color("#ffffffb8".toColorInt())
    val actionInverseSelected = Color("#ffffffd1".toColorInt())
}

object ReverseInverseValuesContainer {
    val actionReverseInverseNormal = Color("#0a121ae0".toColorInt())
    val actionReverseInverseHover = Color("#1d2835cc".toColorInt())
    val actionReverseInverseActive = Color("#182639bd".toColorInt())
    val actionReverseInverseSelected = Color("#1d2835cc".toColorInt())
}

object ActionValuesContainer {
    val primary = PrimaryValuesContainer
    val neutral = NeutralValuesContainer
    val success = SuccessValuesContainer
    val danger = DangerValuesContainer
    val ghost = GhostValuesContainer
    val outline = OutlineValuesContainer
    val inverse = InverseValuesContainer
    val reverseInverse = ReverseInverseValuesContainer
}

object DefaultValuesContainer {
    val interactionDefaultNormal = Color("#3061d5".toColorInt())
    val interactionDefaultHover = Color("#1e4fc2".toColorInt())
    val interactionDefaultActive = Color("#113997".toColorInt())
    val interactionDefaultSelected = Color("#1e4fc2".toColorInt())
    val interactionDefaultSubtleNormal = Color("#ebf0ff".toColorInt())
    val interactionDefaultSubtleHover = Color("#e5eeff".toColorInt())
    val interactionDefaultSubtleActive = Color("#ccdcff".toColorInt())
    val interactionDefaultSubtleSelected = Color("#e5eeff".toColorInt())
}

object NeutralValuesContainer1 {
    val interactionNeutralNormal = Color("#4a545e".toColorInt())
    val interactionNeutralHover = Color("#3a424a".toColorInt())
    val interactionNeutralActive = Color("#272e35".toColorInt())
    val interactionNeutralSelected = Color("#3a424a".toColorInt())
    val interactionNeutralSubtleNormal = Color("#f0f3f5".toColorInt())
    val interactionNeutralSubtleHover = Color("#eaedf0".toColorInt())
    val interactionNeutralSubtleActive = Color("#cfd6dd".toColorInt())
    val interactionNeutralSubtleSelected = Color("#eaedf0".toColorInt())
}

object DangerValuesContainer1 {
    val interactionDangerNormal = Color("#c53434".toColorInt())
    val interactionDangerHover = Color("#952d2d".toColorInt())
    val interactionDangerActive = Color("#6f2020".toColorInt())
    val interactionDangerSelected = Color("#952d2d".toColorInt())
    val interactionDangerSubtleNormal = Color("#ffebeb".toColorInt())
    val interactionDangerSubtleHover = Color("#fee7e7".toColorInt())
    val interactionDangerSubtleActive = Color("#fccfcf".toColorInt())
    val interactionDangerSubtleSelected = Color("#fee7e7".toColorInt())
}

object GhostValuesContainer1 {
    val interactionGhostNormal = Color("#ffffff00".toColorInt())
    val interactionGhostHover = Color("#022e500f".toColorInt())
    val interactionGhostActive = Color("#10284717".toColorInt())
    val interactionGhostSelected = Color("#022e500f".toColorInt())
    val interactionGhostInverseHover = Color("#ffffff1a".toColorInt())
    val interactionGhostInverseNormal = Color("#ffffff1f".toColorInt())
    val interactionGhostInverseSelected = Color("#ffffff1a".toColorInt())
    val interactionGhostDangerHover = Color("#ffebeb".toColorInt())
    val interactionGhostDangerNormal = Color("#fee7e7".toColorInt())
    val interactionGhostDangerSelected = Color("#ffebeb".toColorInt())
}

object DisabledValuesContainer {
    val interactionDisabledNormal = Color("#9ea8b3".toColorInt())
    val interactionDisabledHover = Color("#7e8c9a".toColorInt())
    val interactionDisabledActive = Color("#555f6d".toColorInt())
    val interactionDisabledSubtleNormal = Color("#eaedf0".toColorInt())
    val interactionDisabledSubtleHover = Color("#dee3e7".toColorInt())
    val interactionDisabledSubtleActive = Color("#cfd6dd".toColorInt())
}

object BorderValuesContainer1 {
    val interactionBorderNormal = Color("#8eb0fb".toColorInt())
    val interactionBorderHover = Color("#6691f4".toColorInt())
    val interactionBorderActive = Color("#2759ce".toColorInt())
    val interactionBorderSelected = Color("#3061d5".toColorInt())
    val interactionBorderNeutralNormal = Color("#cfd6dd".toColorInt())
    val interactionBorderNeutralHover = Color("#9ea8b3".toColorInt())
    val interactionBorderNeutralActive = Color("#7e8c9a".toColorInt())
    val interactionBorderNeutralSelected = Color("#9ea8b3".toColorInt())
    val interactionBorderDanger = Color("#f26363".toColorInt())
}

object BackgroundValuesContainer1 {
    val interactionBackgroundModal = Color("#ffffff".toColorInt())
    val interactionBackgroundModeless = Color("#ffffff".toColorInt())
    val interactionBackgroundModelessInverse = Color("#272e35".toColorInt())
    val interactionBackgroundSidepanel = Color("#ffffff".toColorInt())
    val interactionBackgroundFormField = Color("#ffffff".toColorInt())
    val interactionBackgroundDimmer = Color("#182639bd".toColorInt())
}

object InverseValuesContainer1 {
    val interactionInverseNormal = Color("#ffffff".toColorInt())
    val interactionInverseHover = Color("#ffffffd1".toColorInt())
    val interactionInverseActive = Color("#ffffffb8".toColorInt())
    val interactionInverseSelected = Color("#ffffffd1".toColorInt())
}

object FocusValuesContainer {
    val interactionFocusDefault = Color("#6691f4".toColorInt())
}

object InteractionValuesContainer {
    val `default` = DefaultValuesContainer
    val neutral = NeutralValuesContainer1
    val danger = DangerValuesContainer1
    val ghost = GhostValuesContainer1
    val disabled = DisabledValuesContainer
    val border = BorderValuesContainer1
    val background = BackgroundValuesContainer1
    val inverse = InverseValuesContainer1
    val focus = FocusValuesContainer
}

object GrayValuesContainer {
    val nonSemanticGrayContentPrimary = Color("#272e35".toColorInt())
    val nonSemanticGrayContentSecondary = Color("#555f6d".toColorInt())
    val nonSemanticGrayBorderDefault = Color("#eaedf0".toColorInt())
    val nonSemanticGrayBorderStrong = Color("#555f6d".toColorInt())
    val nonSemanticGrayBorderSubtle = Color("#cfd6dd".toColorInt())
    val nonSemanticGrayBackgroundStrong = Color("#555f6d".toColorInt())
    val nonSemanticGrayBackgroundMuted = Color("#dee3e7".toColorInt())
    val nonSemanticGrayBackgroundOnSubtle = Color("#eaedf0".toColorInt())
    val nonSemanticGrayBackgroundSubtle = Color("#f5f7f9".toColorInt())
    val nonSemanticGrayBackgroundSurface = Color("#fcfcfd".toColorInt())
}

object WhiteValuesContainer {
    val nonSemanticWhiteContentPrimary = Color("#ffffff".toColorInt())
    val nonSemanticWhiteContentSecondary = Color("#ffffffa3".toColorInt())
    val nonSemanticWhiteBorderDefault = Color("#ffffff66".toColorInt())
    val nonSemanticWhiteBorderStrong = Color("#ffffff".toColorInt())
    val nonSemanticWhiteBorderSubtle = Color("#ffffffad".toColorInt())
    val nonSemanticWhiteBackgroundStrong = Color("#ffffff".toColorInt())
    val nonSemanticWhiteBackgroundMuted = Color("#ffffffa3".toColorInt())
    val nonSemanticWhiteBackgroundOnSubtle = Color("#ffffff66".toColorInt())
    val nonSemanticWhiteBackgroundSubtle = Color("#ffffff1f".toColorInt())
    val nonSemanticWhiteBackgroundSurface = Color("#ffffff1a".toColorInt())
}

object RedValuesContainer {
    val nonSemanticRedContentPrimary = Color("#6f2020".toColorInt())
    val nonSemanticRedContentSecondary = Color("#c53434".toColorInt())
    val nonSemanticRedBorderDefault = Color("#fee7e7".toColorInt())
    val nonSemanticRedBorderStrong = Color("#c53434".toColorInt())
    val nonSemanticRedBorderSubtle = Color("#fccfcf".toColorInt())
    val nonSemanticRedBackgroundStrong = Color("#c53434".toColorInt())
    val nonSemanticRedBackgroundMuted = Color("#fcd9d9".toColorInt())
    val nonSemanticRedBackgroundOnSubtle = Color("#fee7e7".toColorInt())
    val nonSemanticRedBackgroundSubtle = Color("#fef5f5".toColorInt())
    val nonSemanticRedBackgroundSurface = Color("#fffafa".toColorInt())
}

object MagentaValuesContainer {
    val nonSemanticMagentaContentPrimary = Color("#671e4d".toColorInt())
    val nonSemanticMagentaContentSecondary = Color("#b12f86".toColorInt())
    val nonSemanticMagentaBorderDefault = Color("#fde2f4".toColorInt())
    val nonSemanticMagentaBorderStrong = Color("#b12f86".toColorInt())
    val nonSemanticMagentaBorderSubtle = Color("#f7cae8".toColorInt())
    val nonSemanticMagentaBackgroundStrong = Color("#b12f86".toColorInt())
    val nonSemanticMagentaBackgroundMuted = Color("#fbd5ee".toColorInt())
    val nonSemanticMagentaBackgroundOnSubtle = Color("#fde2f4".toColorInt())
    val nonSemanticMagentaBackgroundSubtle = Color("#fef6fb".toColorInt())
    val nonSemanticMagentaBackgroundSurface = Color("#fffafd".toColorInt())
}

object PurpleValuesContainer {
    val nonSemanticPurpleContentPrimary = Color("#5b1e67".toColorInt())
    val nonSemanticPurpleContentSecondary = Color("#9939ac".toColorInt())
    val nonSemanticPurpleBorderDefault = Color("#f8e2fd".toColorInt())
    val nonSemanticPurpleBorderStrong = Color("#9939ac".toColorInt())
    val nonSemanticPurpleBorderSubtle = Color("#f4caf7".toColorInt())
    val nonSemanticPurpleBackgroundStrong = Color("#9939ac".toColorInt())
    val nonSemanticPurpleBackgroundMuted = Color("#f5d5fb".toColorInt())
    val nonSemanticPurpleBackgroundOnSubtle = Color("#f8e2fd".toColorInt())
    val nonSemanticPurpleBackgroundSubtle = Color("#fdf5ff".toColorInt())
    val nonSemanticPurpleBackgroundSurface = Color("#fefaff".toColorInt())
}

object VioletValuesContainer {
    val nonSemanticVioletContentPrimary = Color("#39288a".toColorInt())
    val nonSemanticVioletContentSecondary = Color("#634eca".toColorInt())
    val nonSemanticVioletBorderDefault = Color("#eeebff".toColorInt())
    val nonSemanticVioletBorderStrong = Color("#634eca".toColorInt())
    val nonSemanticVioletBorderSubtle = Color("#dcd6ff".toColorInt())
    val nonSemanticVioletBackgroundStrong = Color("#634eca".toColorInt())
    val nonSemanticVioletBackgroundMuted = Color("#e3e0ff".toColorInt())
    val nonSemanticVioletBackgroundOnSubtle = Color("#eeebff".toColorInt())
    val nonSemanticVioletBackgroundSubtle = Color("#f7f5ff".toColorInt())
    val nonSemanticVioletBackgroundSurface = Color("#fbfaff".toColorInt())
}

object BlueValuesContainer {
    val nonSemanticBlueContentPrimary = Color("#113997".toColorInt())
    val nonSemanticBlueContentSecondary = Color("#3061d5".toColorInt())
    val nonSemanticBlueBorderDefault = Color("#e5eeff".toColorInt())
    val nonSemanticBlueBorderStrong = Color("#3061d5".toColorInt())
    val nonSemanticBlueBorderSubtle = Color("#ccdcff".toColorInt())
    val nonSemanticBlueBackgroundStrong = Color("#3061d5".toColorInt())
    val nonSemanticBlueBackgroundMuted = Color("#d6e3ff".toColorInt())
    val nonSemanticBlueBackgroundOnSubtle = Color("#e5eeff".toColorInt())
    val nonSemanticBlueBackgroundSubtle = Color("#f5f8ff".toColorInt())
    val nonSemanticBlueBackgroundSurface = Color("#fafbff".toColorInt())
}

object CyanValuesContainer {
    val nonSemanticCyanContentPrimary = Color("#0c456e".toColorInt())
    val nonSemanticCyanContentSecondary = Color("#0870ba".toColorInt())
    val nonSemanticCyanBorderDefault = Color("#e0f1ff".toColorInt())
    val nonSemanticCyanBorderStrong = Color("#0870ba".toColorInt())
    val nonSemanticCyanBorderSubtle = Color("#c2e2ff".toColorInt())
    val nonSemanticCyanBackgroundStrong = Color("#0870ba".toColorInt())
    val nonSemanticCyanBackgroundMuted = Color("#cce7ff".toColorInt())
    val nonSemanticCyanBackgroundOnSubtle = Color("#e0f1ff".toColorInt())
    val nonSemanticCyanBackgroundSubtle = Color("#f0f9ff".toColorInt())
    val nonSemanticCyanBackgroundSurface = Color("#fafdff".toColorInt())
}

object TealValuesContainer {
    val nonSemanticTealContentPrimary = Color("#0a495c".toColorInt())
    val nonSemanticTealContentSecondary = Color("#077597".toColorInt())
    val nonSemanticTealBorderDefault = Color("#e0f3fa".toColorInt())
    val nonSemanticTealBorderStrong = Color("#077597".toColorInt())
    val nonSemanticTealBorderSubtle = Color("#b8e8f5".toColorInt())
    val nonSemanticTealBackgroundStrong = Color("#077597".toColorInt())
    val nonSemanticTealBackgroundMuted = Color("#c5ecf7".toColorInt())
    val nonSemanticTealBackgroundOnSubtle = Color("#e0f3fa".toColorInt())
    val nonSemanticTealBackgroundSubtle = Color("#f0fbff".toColorInt())
    val nonSemanticTealBackgroundSurface = Color("#fafeff".toColorInt())
}

object AquamarineValuesContainer {
    val nonSemanticAquamarineContentPrimary = Color("#0d4a42".toColorInt())
    val nonSemanticAquamarineContentSecondary = Color("#097b68".toColorInt())
    val nonSemanticAquamarineBorderDefault = Color("#daf6f3".toColorInt())
    val nonSemanticAquamarineBorderStrong = Color("#097b68".toColorInt())
    val nonSemanticAquamarineBorderSubtle = Color("#bee9e4".toColorInt())
    val nonSemanticAquamarineBackgroundStrong = Color("#097b68".toColorInt())
    val nonSemanticAquamarineBackgroundMuted = Color("#c5f2ec".toColorInt())
    val nonSemanticAquamarineBackgroundOnSubtle = Color("#daf6f3".toColorInt())
    val nonSemanticAquamarineBackgroundSubtle = Color("#f0faf9".toColorInt())
    val nonSemanticAquamarineBackgroundSurface = Color("#fbfefe".toColorInt())
}

object GreenValuesContainer {
    val nonSemanticGreenContentPrimary = Color("#135315".toColorInt())
    val nonSemanticGreenContentSecondary = Color("#347434".toColorInt())
    val nonSemanticGreenBorderDefault = Color("#dff6df".toColorInt())
    val nonSemanticGreenBorderStrong = Color("#347434".toColorInt())
    val nonSemanticGreenBorderSubtle = Color("#c6ecc6".toColorInt())
    val nonSemanticGreenBackgroundStrong = Color("#347434".toColorInt())
    val nonSemanticGreenBackgroundMuted = Color("#cff2cf".toColorInt())
    val nonSemanticGreenBackgroundOnSubtle = Color("#dff6df".toColorInt())
    val nonSemanticGreenBackgroundSubtle = Color("#f4fbf4".toColorInt())
    val nonSemanticGreenBackgroundSurface = Color("#fbfefb".toColorInt())
}

object OrangeValuesContainer {
    val nonSemanticOrangeContentPrimary = Color("#7a4510".toColorInt())
    val nonSemanticOrangeContentSecondary = Color("#f59638".toColorInt())
    val nonSemanticOrangeBorderDefault = Color("#ffe8d1".toColorInt())
    val nonSemanticOrangeBorderStrong = Color("#f59638".toColorInt())
    val nonSemanticOrangeBorderSubtle = Color("#ffd4a8".toColorInt())
    val nonSemanticOrangeBackgroundStrong = Color("#f59638".toColorInt())
    val nonSemanticOrangeBackgroundMuted = Color("#fcdec0".toColorInt())
    val nonSemanticOrangeBackgroundOnSubtle = Color("#ffe8d1".toColorInt())
    val nonSemanticOrangeBackgroundSubtle = Color("#fff5eb".toColorInt())
    val nonSemanticOrangeBackgroundSurface = Color("#fffcfa".toColorInt())
}

object NonSemanticValuesContainer {
    val gray = GrayValuesContainer
    val white = WhiteValuesContainer
    val red = RedValuesContainer
    val magenta = MagentaValuesContainer
    val purple = PurpleValuesContainer
    val violet = VioletValuesContainer
    val blue = BlueValuesContainer
    val cyan = CyanValuesContainer
    val teal = TealValuesContainer
    val aquamarine = AquamarineValuesContainer
    val green = GreenValuesContainer
    val orange = OrangeValuesContainer
}

object BrandValuesContainer {
    val semanticBrandNegative4 = Color("#041f5d".toColorInt())
    val semanticBrandNegative3 = Color("#113997".toColorInt())
    val semanticBrandNegative2 = Color("#1e4fc2".toColorInt())
    val semanticBrandNegative1 = Color("#2759ce".toColorInt())
    val semanticBrand0 = Color("#3061d5".toColorInt())
    val semanticBrand1 = Color("#6691f4".toColorInt())
    val semanticBrand2 = Color("#8eb0fb".toColorInt())
    val semanticBrand3 = Color("#ccdcff".toColorInt())
    val semanticBrand4 = Color("#d6e3ff".toColorInt())
    val semanticBrand5 = Color("#e5eeff".toColorInt())
    val semanticBrand6 = Color("#ebf0ff".toColorInt())
    val semanticBrand7 = Color("#f5f8ff".toColorInt())
    val semanticBrand8 = Color("#fafbff".toColorInt())
}

object NeutralValuesContainer2 {
    val semanticNeutralNegative4 = Color("#1b242c".toColorInt())
    val semanticNeutralNegative3 = Color("#272e35".toColorInt())
    val semanticNeutralNegative2 = Color("#3a424a".toColorInt())
    val semanticNeutralNegative1 = Color("#4a545e".toColorInt())
    val semanticNeutral0 = Color("#555f6d".toColorInt())
    val semanticNeutral1 = Color("#7e8c9a".toColorInt())
    val semanticNeutral2 = Color("#9ea8b3".toColorInt())
    val semanticNeutral3 = Color("#cfd6dd".toColorInt())
    val semanticNeutral4 = Color("#dee3e7".toColorInt())
    val semanticNeutral5 = Color("#eaedf0".toColorInt())
    val semanticNeutral6 = Color("#f0f3f5".toColorInt())
    val semanticNeutral7 = Color("#f5f7f9".toColorInt())
    val semanticNeutral8 = Color("#fcfcfd".toColorInt())
}

object NeutralAlphaValuesContainer {
    val semanticNeutralANegative4 = Color("#09131aed".toColorInt())
    val semanticNeutralANegative3 = Color("#0a121ae0".toColorInt())
    val semanticNeutralANegative2 = Color("#1a232ddb".toColorInt())
    val semanticNeutralANegative1 = Color("#1d2835cc".toColorInt())
    val semanticNeutralA0 = Color("#182639bd".toColorInt())
    val semanticNeutralA1 = Color("#1830498f".toColorInt())
    val semanticNeutralA2 = Color("#0d253f66".toColorInt())
    val semanticNeutralA3 = Color("#10315633".toColorInt())
    val semanticNeutralA4 = Color("#04294321".toColorInt())
    val semanticNeutralA5 = Color("#10284717".toColorInt())
    val semanticNeutralA6 = Color("#022e500f".toColorInt())
    val semanticNeutralA7 = Color("#00295c0a".toColorInt())
    val semanticNeutralA8 = Color("#1f529e05".toColorInt())
}

object InfoValuesContainer {
    val semanticInfoNegative4 = Color("#041f5d".toColorInt())
    val semanticInfoNegative3 = Color("#113997".toColorInt())
    val semanticInfoNegative2 = Color("#1e4fc2".toColorInt())
    val semanticInfoNegative1 = Color("#2759ce".toColorInt())
    val semanticInfo0 = Color("#3061d5".toColorInt())
    val semanticInfo1 = Color("#6691f4".toColorInt())
    val semanticInfo2 = Color("#8eb0fb".toColorInt())
    val semanticInfo3 = Color("#ccdcff".toColorInt())
    val semanticInfo4 = Color("#d6e3ff".toColorInt())
    val semanticInfo5 = Color("#e5eeff".toColorInt())
    val semanticInfo6 = Color("#ebf0ff".toColorInt())
    val semanticInfo7 = Color("#f5f8ff".toColorInt())
    val semanticInfo8 = Color("#fafbff".toColorInt())
}

object SuccessValuesContainer1 {
    val semanticSuccessNegative4 = Color("#0a2e0b".toColorInt())
    val semanticSuccessNegative3 = Color("#135315".toColorInt())
    val semanticSuccessNegative2 = Color("#246626".toColorInt())
    val semanticSuccessNegative1 = Color("#2f6f2f".toColorInt())
    val semanticSuccess0 = Color("#347434".toColorInt())
    val semanticSuccess1 = Color("#55a555".toColorInt())
    val semanticSuccess2 = Color("#87c987".toColorInt())
    val semanticSuccess3 = Color("#c6ecc6".toColorInt())
    val semanticSuccess4 = Color("#cff2cf".toColorInt())
    val semanticSuccess5 = Color("#dff6df".toColorInt())
    val semanticSuccess6 = Color("#e6f9e6".toColorInt())
    val semanticSuccess7 = Color("#f4fbf4".toColorInt())
    val semanticSuccess8 = Color("#fbfefb".toColorInt())
}

object WarningValuesContainer {
    val semanticWarningNegative4 = Color("#492909".toColorInt())
    val semanticWarningNegative3 = Color("#7a4510".toColorInt())
    val semanticWarningNegative2 = Color("#a05c1c".toColorInt())
    val semanticWarningNegative1 = Color("#b4610e".toColorInt())
    val semanticWarning0 = Color("#f59638".toColorInt())
    val semanticWarning1 = Color("#f6a351".toColorInt())
    val semanticWarning2 = Color("#feb871".toColorInt())
    val semanticWarning3 = Color("#ffd4a8".toColorInt())
    val semanticWarning4 = Color("#fcdec0".toColorInt())
    val semanticWarning5 = Color("#ffe8d1".toColorInt())
    val semanticWarning6 = Color("#fff0e0".toColorInt())
    val semanticWarning7 = Color("#fff5eb".toColorInt())
    val semanticWarning8 = Color("#fffcfa".toColorInt())
}

object DangerValuesContainer2 {
    val semanticDangerNegative4 = Color("#4a0d0d".toColorInt())
    val semanticDangerNegative3 = Color("#6f2020".toColorInt())
    val semanticDangerNegative2 = Color("#952d2d".toColorInt())
    val semanticDangerNegative1 = Color("#a13636".toColorInt())
    val semanticDanger0 = Color("#c53434".toColorInt())
    val semanticDanger1 = Color("#f26363".toColorInt())
    val semanticDanger2 = Color("#f49090".toColorInt())
    val semanticDanger3 = Color("#fccfcf".toColorInt())
    val semanticDanger4 = Color("#fcd9d9".toColorInt())
    val semanticDanger5 = Color("#fee7e7".toColorInt())
    val semanticDanger6 = Color("#ffebeb".toColorInt())
    val semanticDanger7 = Color("#fef5f5".toColorInt())
    val semanticDanger8 = Color("#fffafa".toColorInt())
}

object SemanticValuesContainer {
    val brand = BrandValuesContainer
    val neutral = NeutralValuesContainer2
    val neutralAlpha = NeutralAlphaValuesContainer
    val info = InfoValuesContainer
    val success = SuccessValuesContainer1
    val warning = WarningValuesContainer
    val danger = DangerValuesContainer2
}

object CoolGrayValuesContainer {
    val negative4 = Color("#1b242c".toColorInt())
    val negative3 = Color("#272e35".toColorInt())
    val negative2 = Color("#3a424a".toColorInt())
    val negative1 = Color("#4a545e".toColorInt())
    val coolGray0 = Color("#555f6d".toColorInt())
    val coolGray1 = Color("#7e8c9a".toColorInt())
    val coolGray2 = Color("#9ea8b3".toColorInt())
    val coolGray3 = Color("#cfd6dd".toColorInt())
    val coolGray4 = Color("#dee3e7".toColorInt())
    val coolGray5 = Color("#eaedf0".toColorInt())
    val coolGray6 = Color("#f0f3f5".toColorInt())
    val coolGray7 = Color("#f5f7f9".toColorInt())
    val coolGray8 = Color("#fcfcfd".toColorInt())
}

object CoolGrayAlphaValuesContainer {
    val coolGrayANegative4 = Color("#09131aed".toColorInt())
    val coolGrayANegative3 = Color("#0a121ae0".toColorInt())
    val coolGrayANegative2 = Color("#1a232ddb".toColorInt())
    val coolGrayANegative1 = Color("#1d2835cc".toColorInt())
    val coolGrayA0 = Color("#182639bd".toColorInt())
    val coolGrayA1 = Color("#1830498f".toColorInt())
    val coolGrayA2 = Color("#0d253f66".toColorInt())
    val coolGrayA3 = Color("#10315633".toColorInt())
    val coolGrayA4 = Color("#04294321".toColorInt())
    val coolGrayA5 = Color("#10284717".toColorInt())
    val coolGrayA6 = Color("#022e500f".toColorInt())
    val coolGrayA7 = Color("#00295c0a".toColorInt())
    val coolGrayA8 = Color("#1f529e05".toColorInt())
}

object NeutralGrayValuesContainer {
    val negative4 = Color("#212121".toColorInt())
    val negative3 = Color("#2e2e2e".toColorInt())
    val negative2 = Color("#404040".toColorInt())
    val negative1 = Color("#525252".toColorInt())
    val neutralGray0 = Color("#5e5e5e".toColorInt())
    val neutralGray1 = Color("#8a8a8a".toColorInt())
    val neutralGray2 = Color("#a6a6a6".toColorInt())
    val neutralGray3 = Color("#d6d6d6".toColorInt())
    val neutralGray4 = Color("#e3e3e3".toColorInt())
    val neutralGray5 = Color("#ebebeb".toColorInt())
    val neutralGray6 = Color("#f2f2f2".toColorInt())
    val neutralGray7 = Color("#f7f7f7".toColorInt())
    val neutralGray8 = Color("#fcfcfc".toColorInt())
}

object NeutralGrayAlphaValuesContainer {
    val neutralGrayANegative4 = Color("#121212ed".toColorInt())
    val neutralGrayANegative3 = Color("#0f0f0fe0".toColorInt())
    val neutralGrayANegative2 = Color("#212121db".toColorInt())
    val neutralGrayANegative1 = Color("#262626cc".toColorInt())
    val neutralGrayA0 = Color("#262627bd".toColorInt())
    val neutralGrayA1 = Color("#2b2b2b8f".toColorInt())
    val neutralGrayA2 = Color("#21212166".toColorInt())
    val neutralGrayA3 = Color("#2e2e2e33".toColorInt())
    val neutralGrayA4 = Color("#1f1f1f21".toColorInt())
    val neutralGrayA5 = Color("#1c1c1c17".toColorInt())
    val neutralGrayA6 = Color("#2121210f".toColorInt())
    val neutralGrayA7 = Color("#2e2e2e0a".toColorInt())
    val neutralGrayA8 = Color("#52525205".toColorInt())
}

object WarmGrayValuesContainer {
    val negative4 = Color("#222220".toColorInt())
    val negative3 = Color("#30302c".toColorInt())
    val negative2 = Color("#40403a".toColorInt())
    val negative1 = Color("#52524c".toColorInt())
    val warmGray0 = Color("#5f5f58".toColorInt())
    val warmGray1 = Color("#8b8b84".toColorInt())
    val warmGray2 = Color("#a8a89f".toColorInt())
    val warmGray3 = Color("#d9d9d3".toColorInt())
    val warmGray4 = Color("#e5e5e1".toColorInt())
    val warmGray5 = Color("#eaeae6".toColorInt())
    val warmGray6 = Color("#f3f3f1".toColorInt())
    val warmGray7 = Color("#f8f8f7".toColorInt())
    val warmGray8 = Color("#fdfdfc".toColorInt())
}

object WarmGrayAlphaValuesContainer {
    val warmGrayANegative4 = Color("#131311ed".toColorInt())
    val warmGrayANegative3 = Color("#12120de0".toColorInt())
    val warmGrayANegative2 = Color("#22221bdb".toColorInt())
    val warmGrayANegative1 = Color("#272720cc".toColorInt())
    val warmGrayA0 = Color("#26261cbd".toColorInt())
    val warmGrayA1 = Color("#2f2f238f".toColorInt())
    val warmGrayA2 = Color("#28281166".toColorInt())
    val warmGrayA3 = Color("#3e3e1d33".toColorInt())
    val warmGrayA4 = Color("#33331421".toColorInt())
    val warmGrayA5 = Color("#22220217".toColorInt())
    val warmGrayA6 = Color("#2f2f0e0f".toColorInt())
    val warmGrayA7 = Color("#2f2f2d0a".toColorInt())
    val warmGrayA8 = Color("#52525205".toColorInt())
}

object WhiteAlphaValuesContainer {
    val whiteANegative12 = Color("#ffffff05".toColorInt())
    val whiteANegative11 = Color("#ffffff08".toColorInt())
    val whiteANegative10 = Color("#ffffff0d".toColorInt())
    val whiteANegative9 = Color("#ffffff14".toColorInt())
    val whiteANegative8 = Color("#ffffff1a".toColorInt())
    val whiteANegative7 = Color("#ffffff1f".toColorInt())
    val whiteANegative6 = Color("#ffffff3d".toColorInt())
    val whiteANegative5 = Color("#ffffff66".toColorInt())
    val whiteANegative4 = Color("#ffffffa3".toColorInt())
    val whiteANegative3 = Color("#ffffffad".toColorInt())
    val whiteANegative2 = Color("#ffffffb8".toColorInt())
    val whiteANegative1 = Color("#ffffffd1".toColorInt())
    val whiteA0 = Color("#ffffff".toColorInt())
}

object RedValuesContainer1 {
    val negative4 = Color("#4a0d0d".toColorInt())
    val negative3 = Color("#6f2020".toColorInt())
    val negative2 = Color("#952d2d".toColorInt())
    val negative1 = Color("#a13636".toColorInt())
    val red0 = Color("#c53434".toColorInt())
    val red1 = Color("#f26363".toColorInt())
    val red2 = Color("#f49090".toColorInt())
    val red3 = Color("#fccfcf".toColorInt())
    val red4 = Color("#fcd9d9".toColorInt())
    val red5 = Color("#fee7e7".toColorInt())
    val red6 = Color("#ffebeb".toColorInt())
    val red7 = Color("#fef5f5".toColorInt())
    val red8 = Color("#fffafa".toColorInt())
}

object MagentaValuesContainer1 {
    val negative4 = Color("#410b2f".toColorInt())
    val negative3 = Color("#671e4d".toColorInt())
    val negative2 = Color("#892969".toColorInt())
    val negative1 = Color("#953274".toColorInt())
    val magenta0 = Color("#b12f86".toColorInt())
    val magenta1 = Color("#de5eb3".toColorInt())
    val magenta2 = Color("#ec89cb".toColorInt())
    val magenta3 = Color("#f7cae8".toColorInt())
    val magenta4 = Color("#fbd5ee".toColorInt())
    val magenta5 = Color("#fde2f4".toColorInt())
    val magenta6 = Color("#fdedf8".toColorInt())
    val magenta7 = Color("#fef6fb".toColorInt())
    val magenta8 = Color("#fffafd".toColorInt())
}

object PurpleValuesContainer1 {
    val negative4 = Color("#410b2f".toColorInt())
    val negative3 = Color("#5b1e67".toColorInt())
    val negative2 = Color("#792989".toColorInt())
    val negative1 = Color("#853295".toColorInt())
    val purple0 = Color("#9939ac".toColorInt())
    val purple1 = Color("#c466db".toColorInt())
    val purple2 = Color("#d98eec".toColorInt())
    val purple3 = Color("#f4caf7".toColorInt())
    val purple4 = Color("#f5d5fb".toColorInt())
    val purple5 = Color("#f8e2fd".toColorInt())
    val purple6 = Color("#faedfd".toColorInt())
    val purple7 = Color("#fdf5ff".toColorInt())
    val purple8 = Color("#fefaff".toColorInt())
}

object VioletValuesContainer1 {
    val negative4 = Color("#201263".toColorInt())
    val negative3 = Color("#39288a".toColorInt())
    val negative2 = Color("#4e38bc".toColorInt())
    val negative1 = Color("#573fcf".toColorInt())
    val violet0 = Color("#634eca".toColorInt())
    val violet1 = Color("#927ef1".toColorInt())
    val violet2 = Color("#aba2fb".toColorInt())
    val violet3 = Color("#dcd6ff".toColorInt())
    val violet4 = Color("#e3e0ff".toColorInt())
    val violet5 = Color("#eeebff".toColorInt())
    val violet6 = Color("#f3f0ff".toColorInt())
    val violet7 = Color("#f7f5ff".toColorInt())
    val violet8 = Color("#fbfaff".toColorInt())
}

object BlueValuesContainer1 {
    val negative4 = Color("#041f5d".toColorInt())
    val negative3 = Color("#113997".toColorInt())
    val negative2 = Color("#1e4fc2".toColorInt())
    val negative1 = Color("#2759ce".toColorInt())
    val blue0 = Color("#3061d5".toColorInt())
    val blue1 = Color("#6691f4".toColorInt())
    val blue2 = Color("#8eb0fb".toColorInt())
    val blue3 = Color("#ccdcff".toColorInt())
    val blue4 = Color("#d6e3ff".toColorInt())
    val blue5 = Color("#e5eeff".toColorInt())
    val blue6 = Color("#ebf0ff".toColorInt())
    val blue7 = Color("#f5f8ff".toColorInt())
    val blue8 = Color("#fafbff".toColorInt())
}

object CyanValuesContainer1 {
    val negative4 = Color("#002742".toColorInt())
    val negative3 = Color("#0c456e".toColorInt())
    val negative2 = Color("#165c8d".toColorInt())
    val negative1 = Color("#1b679d".toColorInt())
    val cyan0 = Color("#0870ba".toColorInt())
    val cyan1 = Color("#5699dc".toColorInt())
    val cyan2 = Color("#79bcf6".toColorInt())
    val cyan3 = Color("#c2e2ff".toColorInt())
    val cyan4 = Color("#cce7ff".toColorInt())
    val cyan5 = Color("#e0f1ff".toColorInt())
    val cyan6 = Color("#ebf5ff".toColorInt())
    val cyan7 = Color("#f0f9ff".toColorInt())
    val cyan8 = Color("#fafdff".toColorInt())
}

object TealValuesContainer1 {
    val negative4 = Color("#012a37".toColorInt())
    val negative3 = Color("#0a495c".toColorInt())
    val negative2 = Color("#196076".toColorInt())
    val negative1 = Color("#196c85".toColorInt())
    val teal0 = Color("#077597".toColorInt())
    val teal1 = Color("#4f9eba".toColorInt())
    val teal2 = Color("#7ac0dc".toColorInt())
    val teal3 = Color("#b8e8f5".toColorInt())
    val teal4 = Color("#c5ecf7".toColorInt())
    val teal5 = Color("#e0f3fa".toColorInt())
    val teal6 = Color("#e8f7fc".toColorInt())
    val teal7 = Color("#f0fbff".toColorInt())
    val teal8 = Color("#fafeff".toColorInt())
}

object AquamarineValuesContainer1 {
    val negative4 = Color("#012d26".toColorInt())
    val negative3 = Color("#0d4a42".toColorInt())
    val negative2 = Color("#15665b".toColorInt())
    val negative1 = Color("#1a7061".toColorInt())
    val aquamarine0 = Color("#097b68".toColorInt())
    val aquamarine1 = Color("#3da496".toColorInt())
    val aquamarine2 = Color("#6ec9bf".toColorInt())
    val aquamarine3 = Color("#bee9e4".toColorInt())
    val aquamarine4 = Color("#c5f2ec".toColorInt())
    val aquamarine5 = Color("#daf6f3".toColorInt())
    val aquamarine6 = Color("#e2f8f5".toColorInt())
    val aquamarine7 = Color("#f0faf9".toColorInt())
    val aquamarine8 = Color("#fbfefe".toColorInt())
}

object GreenValuesContainer1 {
    val negative4 = Color("#0a2e0b".toColorInt())
    val negative3 = Color("#135315".toColorInt())
    val negative2 = Color("#246626".toColorInt())
    val negative1 = Color("#2f6f2f".toColorInt())
    val green0 = Color("#347434".toColorInt())
    val green1 = Color("#55a555".toColorInt())
    val green2 = Color("#87c987".toColorInt())
    val green3 = Color("#c6ecc6".toColorInt())
    val green4 = Color("#cff2cf".toColorInt())
    val green5 = Color("#dff6df".toColorInt())
    val green6 = Color("#e6f9e6".toColorInt())
    val green7 = Color("#f4fbf4".toColorInt())
    val green8 = Color("#fbfefb".toColorInt())
}

object OrangeValuesContainer1 {
    val negative4 = Color("#492909".toColorInt())
    val negative3 = Color("#7a4510".toColorInt())
    val negative2 = Color("#a05c1c".toColorInt())
    val negative1 = Color("#b4610e".toColorInt())
    val orange0 = Color("#f59638".toColorInt())
    val orange1 = Color("#f6a351".toColorInt())
    val orange2 = Color("#feb871".toColorInt())
    val orange3 = Color("#ffd4a8".toColorInt())
    val orange4 = Color("#fcdec0".toColorInt())
    val orange5 = Color("#ffe8d1".toColorInt())
    val orange6 = Color("#fff0e0".toColorInt())
    val orange7 = Color("#fff5eb".toColorInt())
    val orange8 = Color("#fffcfa".toColorInt())
}

object TransparentValuesContainer {
    val transparent = Color("#ffffff00".toColorInt())
}

object ColorValuesContainer {
    val content = ContentValuesContainer
    val border = BorderValuesContainer
    val background = BackgroundValuesContainer
    val action = ActionValuesContainer
    val interaction = InteractionValuesContainer
    val nonSemantic = NonSemanticValuesContainer
    val semantic = SemanticValuesContainer
    val coolGray = CoolGrayValuesContainer
    val coolGrayAlpha = CoolGrayAlphaValuesContainer
    val neutralGray = NeutralGrayValuesContainer
    val neutralGrayAlpha = NeutralGrayAlphaValuesContainer
    val warmGray = WarmGrayValuesContainer
    val warmGrayAlpha = WarmGrayAlphaValuesContainer
    val whiteAlpha = WhiteAlphaValuesContainer
    val red = RedValuesContainer1
    val magenta = MagentaValuesContainer1
    val purple = PurpleValuesContainer1
    val violet = VioletValuesContainer1
    val blue = BlueValuesContainer1
    val cyan = CyanValuesContainer1
    val teal = TealValuesContainer1
    val aquamarine = AquamarineValuesContainer1
    val green = GreenValuesContainer1
    val orange = OrangeValuesContainer1
    val transparent = TransparentValuesContainer
}

object BorderWidthValuesContainer {
    val focus = 2.0
    val none = 0.0
    val small = 1.0
    val medium = 2.0
    val large = 4.0
    val xLarge = 8.0
    val borderWidth0 = 0.0
    val borderWidth100 = 1.0
    val borderWidth200 = 2.0
    val borderWidth400 = 4.0
    val borderWidth800 = 8.0
}

object BorderRadiusValuesContainer {
    val none = 0.0
    val small = 2.0
    val medium = 4.0
    val large = 8.0
    val xLarge = 12.0
    val borderRadius2xLarge = 16.0
    val borderRadius3xLarge = 20.0
    val borderRadius4xLarge = 24.0
    val full = 999.0
    val borderRadius0 = 0.0
    val borderRadius25 = 2.0
    val borderRadius50 = 4.0
    val borderRadius100 = 8.0
    val borderRadius150 = 12.0
    val borderRadius200 = 16.0
    val borderRadius250 = 20.0
    val borderRadius300 = 24.0
    val borderRadius999 = 999.0
}

object SizeValuesContainer {
    val size3xLarge = 72.0
    val size2xLarge = 64.0
    val xLarge = 56.0
    val large = 48.0
    val medium = 40.0
    val small = 32.0
    val xSmall = 24.0
    val size2xSmall = 20.0
    val size3xSmall = 16.0
}

object PaddingValuesContainer {
    val none = 0.0
    val padding2xSmall = 2.0
    val xSmall = 4.0
    val small = 8.0
    val medium = 12.0
    val large = 16.0
    val padding2xLarge = 24.0
    val padding3xLarge = 32.0
    val padding4xLarge = 40.0
    val padding5xLarge = 44.0
    val padding6xLarge = 64.0
}

object GapValuesContainer {
    val none = 0.0
    val gap2xSmall = 2.0
    val xSmall = 4.0
    val small = 8.0
    val medium = 12.0
    val large = 16.0
    val xLarge = 24.0
    val gap2xLarge = 32.0
    val gap3xLarge = 44.0
}

object SpaceValuesContainer {
    val padding = PaddingValuesContainer
    val gap = GapValuesContainer
}

object OpacityValuesContainer {
    val disabled = 0.5
    val opacity0 = 0.0
    val opacity50 = 0.5
    val opacity100 = 1.0
}

object CodeValuesContainer {
    val typographyCodeSmall = Typography(lineHeight = 16.0, letterSpacing = 0.0, fontWeight = 400.0, fontSize = 12.0, fontFamily = "Noto Sans Mono")
    val typographyCodeMedium = Typography(lineHeight = 20.0, letterSpacing = -0.006, fontWeight = 400.0, fontSize = 14.0, fontFamily = "Noto Sans Mono")
    val typographyCodeLarge = Typography(lineHeight = 22.0, letterSpacing = -0.011, fontWeight = 400.0, fontSize = 16.0, fontFamily = "Noto Sans Mono")
}

object UtilityValuesContainer {
    val typographyUtilitySmall = Typography(lineHeight = 16.0, letterSpacing = 0.0, fontWeight = 500.0, fontSize = 12.0, fontFamily = "Noto Sans")
    val typographyUtilityMedium = Typography(lineHeight = 20.0, letterSpacing = -0.006, fontWeight = 500.0, fontSize = 14.0, fontFamily = "Noto Sans")
    val typographyUtilityLarge = Typography(lineHeight = 22.0, letterSpacing = -0.011, fontWeight = 500.0, fontSize = 16.0, fontFamily = "Noto Sans")
}

object BodyValuesContainer {
    val typographyBodySmall = Typography(lineHeight = 16.0, letterSpacing = 0.0, fontWeight = 400.0, fontSize = 12.0, fontFamily = "Noto Sans")
    val typographyBodyMedium = Typography(lineHeight = 20.0, letterSpacing = -0.006, fontWeight = 400.0, fontSize = 14.0, fontFamily = "Noto Sans")
    val typographyBodyLarge = Typography(lineHeight = 22.0, letterSpacing = -0.011, fontWeight = 400.0, fontSize = 16.0, fontFamily = "Noto Sans")
}

object HeadingValuesContainer {
    val typographyHeadingSmall = Typography(lineHeight = 16.0, letterSpacing = 0.0, fontWeight = 700.0, fontSize = 12.0, fontFamily = "Noto Sans")
    val typographyHeadingMedium = Typography(lineHeight = 20.0, letterSpacing = -0.006, fontWeight = 700.0, fontSize = 14.0, fontFamily = "Noto Sans")
    val typographyHeadingLarge = Typography(lineHeight = 22.0, letterSpacing = -0.011, fontWeight = 700.0, fontSize = 16.0, fontFamily = "Noto Sans")
    val typographyHeadingXLarge = Typography(lineHeight = 24.0, letterSpacing = -0.014, fontWeight = 700.0, fontSize = 18.0, fontFamily = "Noto Sans")
    val typographyHeading2xLarge = Typography(lineHeight = 26.0, letterSpacing = -0.017, fontWeight = 700.0, fontSize = 20.0, fontFamily = "Noto Sans")
    val typographyHeading3xLarge = Typography(lineHeight = 32.0, letterSpacing = -0.019, fontWeight = 700.0, fontSize = 24.0, fontFamily = "Noto Sans")
    val typographyHeading4xLarge = Typography(lineHeight = 38.0, letterSpacing = -0.021, fontWeight = 700.0, fontSize = 28.0, fontFamily = "Noto Sans")
    val typographyHeading5xLarge = Typography(lineHeight = 42.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 32.0, fontFamily = "Noto Sans")
    val typographyHeading6xLarge = Typography(lineHeight = 48.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 36.0, fontFamily = "Noto Sans")
    val typographyHeading7xLarge = Typography(lineHeight = 56.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 42.0, fontFamily = "Noto Sans")
    val typographyHeading8xLarge = Typography(lineHeight = 58.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 48.0, fontFamily = "Noto Sans")
    val typographyHeading9xLarge = Typography(lineHeight = 66.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 54.0, fontFamily = "Noto Sans")
}

object DisplayValuesContainer {
    val typographyDisplaySmall = Typography(lineHeight = 66.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 54.0, fontFamily = "Noto Sans")
    val typographyDisplayMedium = Typography(lineHeight = 72.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 60.0, fontFamily = "Noto Sans")
    val typographyDisplayLarge = Typography(lineHeight = 82.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 68.0, fontFamily = "Noto Sans")
    val typographyDisplayXLarge = Typography(lineHeight = 92.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 76.0, fontFamily = "Noto Sans")
    val typographyDisplay2xLarge = Typography(lineHeight = 102.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 84.0, fontFamily = "Noto Sans")
    val typographyDisplay3xLarge = Typography(lineHeight = 112.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 92.0, fontFamily = "Noto Sans")
}

object TypographyValuesContainer {
    val code = CodeValuesContainer
    val utility = UtilityValuesContainer
    val body = BodyValuesContainer
    val heading = HeadingValuesContainer
    val display = DisplayValuesContainer
}

object DimensionValuesContainer {
    val dimension0 = 0.0
    val dimension25 = 2.0
    val dimension50 = 4.0
    val dimension100 = 8.0
    val dimension150 = 12.0
    val dimension200 = 16.0
    val dimension250 = 20.0
    val dimension300 = 24.0
    val dimension400 = 32.0
    val dimension500 = 40.0
    val dimension550 = 44.0
    val dimension600 = 48.0
    val dimension700 = 56.0
    val dimension800 = 64.0
    val dimension900 = 72.0
    val dimension1000 = 80.0
    val dimension1200 = 96.0
    val dimension1500 = 120.0
    val dimension1600 = 128.0
}

object BottomValuesContainer {
    val elevationBottom100 = BoxShadow(y = 1.0, x = 0.0, type = "dropShadow", spread = 0.0, color = "#1b242c1f", blur = 2.0)
    val elevationBottom200 = listOf(BoxShadow(y = 2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c0a", blur = 2.0), BoxShadow(y = 2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c14", blur = 8.0))
    val elevationBottom300 = listOf(BoxShadow(y = 2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c0a", blur = 2.0), BoxShadow(y = 8.0, x = 0.0, type = "dropShadow", spread = -2.0, color = "#1b242c1f", blur = 16.0))
    val elevationBottom400 = listOf(BoxShadow(y = 2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c0a", blur = 2.0), BoxShadow(y = 16.0, x = 0.0, type = "dropShadow", spread = -6.0, color = "#1b242c29", blur = 24.0))
}

object TopValuesContainer {
    val elevationTop100 = BoxShadow(y = -1.0, x = 0.0, type = "dropShadow", spread = 0.0, color = "#1b242c1f", blur = 2.0)
    val elevationTop200 = listOf(BoxShadow(y = -2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c0a", blur = 2.0), BoxShadow(y = -2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c14", blur = 8.0))
    val elevationTop300 = listOf(BoxShadow(y = -2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c0a", blur = 2.0), BoxShadow(y = -8.0, x = 0.0, type = "dropShadow", spread = -2.0, color = "#1b242c1f", blur = 16.0))
    val elevationTop400 = listOf(BoxShadow(y = -2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c0a", blur = 2.0), BoxShadow(y = -16.0, x = 0.0, type = "dropShadow", spread = -6.0, color = "#1b242c29", blur = 24.0))
}

object ElevationValuesContainer {
    val bottom = BottomValuesContainer
    val top = TopValuesContainer
}

object FontFamilyValuesContainer {
    val sans = "Noto Sans"
    val serif = "Noto Serif"
    val mono = "Noto Sans Mono"
}

object FontSizeValuesContainer {
    val fontSize100 = 8.0
    val fontSize125 = 10.0
    val fontSize150 = 12.0
    val fontSize175 = 14.0
    val fontSize200 = 16.0
    val fontSize225 = 18.0
    val fontSize250 = 20.0
    val fontSize300 = 24.0
    val fontSize350 = 28.0
    val fontSize400 = 32.0
    val fontSize450 = 36.0
    val fontSize525 = 42.0
    val fontSize600 = 48.0
    val fontSize675 = 54.0
    val fontSize750 = 60.0
    val fontSize850 = 68.0
    val fontSize950 = 76.0
    val fontSize1050 = 84.0
    val fontSize1150 = 92.0
}

object FontWeightValuesContainer {
    val fontWeight300 = 300.0
    val fontWeight400 = 400.0
    val fontWeight500 = 500.0
    val fontWeight600 = 600.0
    val fontWeight700 = 700.0
}

object LetterSpacingValuesContainer {
    val letterSpacing0 = 0.0
    val letterSpacing100 = -0.006
    val letterSpacing200 = -0.011
    val letterSpacing300 = -0.014
    val letterSpacing400 = -0.017
    val letterSpacing500 = -0.019
    val letterSpacing600 = -0.021
    val letterSpacing700 = -0.022
}

object LineHeightValuesContainer {
    val value150 = 12.0
    val value200 = 16.0
    val value250 = 20.0
    val value275 = 22.0
    val value300 = 24.0
    val value325 = 26.0
    val value400 = 32.0
    val value475 = 38.0
    val value525 = 42.0
    val value600 = 48.0
    val value700 = 56.0
    val value725 = 58.0
    val value825 = 66.0
    val value900 = 72.0
    val value1025 = 82.0
    val value1150 = 92.0
    val value1275 = 102.0
    val value1400 = 112.0
}

object ContentValuesContainer1 {
    val primary = Color("#272e35".toColorInt())
    val secondary = Color("#555f6d".toColorInt())
    val tertiary = Color("#7e8c9a".toColorInt())
    val disabled = Color("#9ea8b3".toColorInt())
    val primaryInverse = Color("#ffffff".toColorInt())
    val secondaryInverse = Color("#ffffffa3".toColorInt())
    val tertiaryInverse = Color("#ffffff66".toColorInt())
    val disabledInverse = Color("#ffffff3d".toColorInt())
    val infoPrimary = Color("#113997".toColorInt())
    val infoSecondary = Color("#3061d5".toColorInt())
    val successPrimary = Color("#135315".toColorInt())
    val successSecondary = Color("#347434".toColorInt())
    val warningPrimary = Color("#7a4510".toColorInt())
    val warningSecondary = Color("#f59638".toColorInt())
    val dangerPrimary = Color("#6f2020".toColorInt())
    val dangerSecondary = Color("#c53434".toColorInt())
    val brandPrimary = Color("#113997".toColorInt())
    val brandSecondary = Color("#3061d5".toColorInt())
}

object BorderValuesContainer2 {
    val `default` = Color("#eaedf0".toColorInt())
    val defaultA = Color("#10284717".toColorInt())
    val inverse = Color("#ffffff".toColorInt())
    val neutralStrong = Color("#555f6d".toColorInt())
    val neutralSubtle = Color("#cfd6dd".toColorInt())
    val infoStrong = Color("#3061d5".toColorInt())
    val infoSubtle = Color("#ccdcff".toColorInt())
    val successStrong = Color("#347434".toColorInt())
    val successSubtle = Color("#c6ecc6".toColorInt())
    val warningStrong = Color("#f59638".toColorInt())
    val warningSubtle = Color("#ffd4a8".toColorInt())
    val dangerStrong = Color("#c53434".toColorInt())
    val dangerSubtle = Color("#fccfcf".toColorInt())
}

object BackgroundValuesContainer2 {
    val `default` = Color("#ffffff".toColorInt())
    val inverse = Color("#272e35".toColorInt())
    val neutralStrong = Color("#555f6d".toColorInt())
    val neutralMuted = Color("#dee3e7".toColorInt())
    val neutralOnSubtle = Color("#eaedf0".toColorInt())
    val neutralSubtle = Color("#f5f7f9".toColorInt())
    val neutralSurface = Color("#fcfcfd".toColorInt())
    val infoStrong = Color("#3061d5".toColorInt())
    val infoMuted = Color("#d6e3ff".toColorInt())
    val infoOnSubtle = Color("#e5eeff".toColorInt())
    val infoSubtle = Color("#f5f8ff".toColorInt())
    val infoSurface = Color("#fafbff".toColorInt())
    val successStrong = Color("#347434".toColorInt())
    val successMuted = Color("#cff2cf".toColorInt())
    val successOnSubtle = Color("#dff6df".toColorInt())
    val successSubtle = Color("#f4fbf4".toColorInt())
    val successSurface = Color("#fbfefb".toColorInt())
    val warningStrong = Color("#f59638".toColorInt())
    val warningMuted = Color("#fcdec0".toColorInt())
    val warningOnSubtle = Color("#ffe8d1".toColorInt())
    val warningSubtle = Color("#fff5eb".toColorInt())
    val warningSurface = Color("#fffcfa".toColorInt())
    val dangerStrong = Color("#c53434".toColorInt())
    val dangerMuted = Color("#fcd9d9".toColorInt())
    val dangerOnSubtle = Color("#fee7e7".toColorInt())
    val dangerSubtle = Color("#fef5f5".toColorInt())
    val dangerSurface = Color("#fffafa".toColorInt())
    val brandStrong = Color("#3061d5".toColorInt())
    val brandMuted = Color("#d6e3ff".toColorInt())
    val brandOnSubtle = Color("#e5eeff".toColorInt())
    val brandSurface = Color("#fafbff".toColorInt())
    val brandSubtle = Color("#f5f8ff".toColorInt())
}

object PrimaryValuesContainer1 {
    val actionPrimaryNormal = Color("#3061d5".toColorInt())
    val actionPrimaryHover = Color("#1e4fc2".toColorInt())
    val actionPrimaryActive = Color("#113997".toColorInt())
    val actionPrimarySelected = Color("#1e4fc2".toColorInt())
    val actionPrimarySubtleNormal = Color("#ebf0ff".toColorInt())
    val actionPrimarySubtleHover = Color("#e5eeff".toColorInt())
    val actionPrimarySubtleActive = Color("#ccdcff".toColorInt())
    val actionPrimarySubtleSelected = Color("#e5eeff".toColorInt())
}

object NeutralValuesContainer3 {
    val actionNeutralNormal = Color("#4a545e".toColorInt())
    val actionNeutralHover = Color("#3a424a".toColorInt())
    val actionNeutralActive = Color("#272e35".toColorInt())
    val actionNeutralSelected = Color("#3a424a".toColorInt())
    val actionNeutralSubtleNormal = Color("#f0f3f5".toColorInt())
    val actionNeutralSubtleHover = Color("#eaedf0".toColorInt())
    val actionNeutralSubtleActive = Color("#cfd6dd".toColorInt())
    val actionNeutralSubtleSelected = Color("#eaedf0".toColorInt())
}

object SuccessValuesContainer2 {
    val actionSuccessNormal = Color("#347434".toColorInt())
    val actionSuccessHover = Color("#246626".toColorInt())
    val actionSuccessActive = Color("#135315".toColorInt())
    val actionSuccessSelected = Color("#246626".toColorInt())
    val actionSuccessSubtleNormal = Color("#e6f9e6".toColorInt())
    val actionSuccessSubtleHover = Color("#dff6df".toColorInt())
    val actionSuccessSubtleActive = Color("#c6ecc6".toColorInt())
    val actionSuccessSubtleSelected = Color("#dff6df".toColorInt())
}

object DangerValuesContainer3 {
    val actionDangerNormal = Color("#c53434".toColorInt())
    val actionDangerHover = Color("#952d2d".toColorInt())
    val actionDangerActive = Color("#6f2020".toColorInt())
    val actionDangerSelected = Color("#952d2d".toColorInt())
    val actionDangerSubtleNormal = Color("#ffebeb".toColorInt())
    val actionDangerSubtleHover = Color("#fee7e7".toColorInt())
    val actionDangerSubtleActive = Color("#fccfcf".toColorInt())
    val actionDangerSubtleSelected = Color("#fee7e7".toColorInt())
}

object GhostValuesContainer2 {
    val actionGhostNormal = Color("#ffffff00".toColorInt())
    val actionGhostHover = Color("#022e500f".toColorInt())
    val actionGhostActive = Color("#10284717".toColorInt())
    val actionGhostSelected = Color("#022e500f".toColorInt())
    val actionGhostInverseHover = Color("#ffffff1a".toColorInt())
    val actionGhostInverseActive = Color("#ffffff1f".toColorInt())
    val actionGhostInverseSelected = Color("#ffffff1a".toColorInt())
    val actionGhostDangerHover = Color("#ffebeb".toColorInt())
    val actionGhostDangerActive = Color("#fee7e7".toColorInt())
    val actionGhostDangerSelected = Color("#ffebeb".toColorInt())
}

object OutlineValuesContainer1 {
    val actionOutlineNormal = Color("#cfd6dd".toColorInt())
    val actionOutlineHover = Color("#9ea8b3".toColorInt())
    val actionOutlineActive = Color("#7e8c9a".toColorInt())
    val actionOutlineSelected = Color("#9ea8b3".toColorInt())
}

object InverseValuesContainer2 {
    val actionInverseNormal = Color("#ffffff".toColorInt())
    val actionInverseHover = Color("#ffffffd1".toColorInt())
    val actionInverseActive = Color("#ffffffb8".toColorInt())
    val actionInverseSelected = Color("#ffffffd1".toColorInt())
}

object ReverseInverseValuesContainer1 {
    val actionReverseInverseNormal = Color("#0a121ae0".toColorInt())
    val actionReverseInverseHover = Color("#1d2835cc".toColorInt())
    val actionReverseInverseActive = Color("#182639bd".toColorInt())
    val actionReverseInverseSelected = Color("#1d2835cc".toColorInt())
}

object ActionValuesContainer1 {
    val primary = PrimaryValuesContainer1
    val neutral = NeutralValuesContainer3
    val success = SuccessValuesContainer2
    val danger = DangerValuesContainer3
    val ghost = GhostValuesContainer2
    val outline = OutlineValuesContainer1
    val inverse = InverseValuesContainer2
    val reverseInverse = ReverseInverseValuesContainer1
}

object DefaultValuesContainer1 {
    val interactionDefaultNormal = Color("#3061d5".toColorInt())
    val interactionDefaultHover = Color("#1e4fc2".toColorInt())
    val interactionDefaultActive = Color("#113997".toColorInt())
    val interactionDefaultSelected = Color("#1e4fc2".toColorInt())
    val interactionDefaultSubtleNormal = Color("#ebf0ff".toColorInt())
    val interactionDefaultSubtleHover = Color("#e5eeff".toColorInt())
    val interactionDefaultSubtleActive = Color("#ccdcff".toColorInt())
    val interactionDefaultSubtleSelected = Color("#e5eeff".toColorInt())
}

object NeutralValuesContainer4 {
    val interactionNeutralNormal = Color("#4a545e".toColorInt())
    val interactionNeutralHover = Color("#3a424a".toColorInt())
    val interactionNeutralActive = Color("#272e35".toColorInt())
    val interactionNeutralSelected = Color("#3a424a".toColorInt())
    val interactionNeutralSubtleNormal = Color("#f0f3f5".toColorInt())
    val interactionNeutralSubtleHover = Color("#eaedf0".toColorInt())
    val interactionNeutralSubtleActive = Color("#cfd6dd".toColorInt())
    val interactionNeutralSubtleSelected = Color("#eaedf0".toColorInt())
}

object DangerValuesContainer4 {
    val interactionDangerNormal = Color("#c53434".toColorInt())
    val interactionDangerHover = Color("#952d2d".toColorInt())
    val interactionDangerActive = Color("#6f2020".toColorInt())
    val interactionDangerSelected = Color("#952d2d".toColorInt())
    val interactionDangerSubtleNormal = Color("#ffebeb".toColorInt())
    val interactionDangerSubtleHover = Color("#fee7e7".toColorInt())
    val interactionDangerSubtleActive = Color("#fccfcf".toColorInt())
    val interactionDangerSubtleSelected = Color("#fee7e7".toColorInt())
}

object GhostValuesContainer3 {
    val interactionGhostNormal = Color("#ffffff00".toColorInt())
    val interactionGhostHover = Color("#022e500f".toColorInt())
    val interactionGhostActive = Color("#10284717".toColorInt())
    val interactionGhostSelected = Color("#022e500f".toColorInt())
    val interactionGhostInverseHover = Color("#ffffff1a".toColorInt())
    val interactionGhostInverseNormal = Color("#ffffff1f".toColorInt())
    val interactionGhostInverseSelected = Color("#ffffff1a".toColorInt())
    val interactionGhostDangerHover = Color("#ffebeb".toColorInt())
    val interactionGhostDangerNormal = Color("#fee7e7".toColorInt())
    val interactionGhostDangerSelected = Color("#ffebeb".toColorInt())
}

object DisabledValuesContainer1 {
    val interactionDisabledNormal = Color("#9ea8b3".toColorInt())
    val interactionDisabledHover = Color("#7e8c9a".toColorInt())
    val interactionDisabledActive = Color("#555f6d".toColorInt())
    val interactionDisabledSubtleNormal = Color("#eaedf0".toColorInt())
    val interactionDisabledSubtleHover = Color("#dee3e7".toColorInt())
    val interactionDisabledSubtleActive = Color("#cfd6dd".toColorInt())
}

object BorderValuesContainer3 {
    val interactionBorderNormal = Color("#8eb0fb".toColorInt())
    val interactionBorderHover = Color("#6691f4".toColorInt())
    val interactionBorderActive = Color("#2759ce".toColorInt())
    val interactionBorderSelected = Color("#3061d5".toColorInt())
    val interactionBorderNeutralNormal = Color("#cfd6dd".toColorInt())
    val interactionBorderNeutralHover = Color("#9ea8b3".toColorInt())
    val interactionBorderNeutralActive = Color("#7e8c9a".toColorInt())
    val interactionBorderNeutralSelected = Color("#9ea8b3".toColorInt())
    val interactionBorderDanger = Color("#f26363".toColorInt())
}

object BackgroundValuesContainer3 {
    val interactionBackgroundModal = Color("#ffffff".toColorInt())
    val interactionBackgroundModeless = Color("#ffffff".toColorInt())
    val interactionBackgroundModelessInverse = Color("#272e35".toColorInt())
    val interactionBackgroundSidepanel = Color("#ffffff".toColorInt())
    val interactionBackgroundFormField = Color("#ffffff".toColorInt())
    val interactionBackgroundDimmer = Color("#182639bd".toColorInt())
}

object InverseValuesContainer3 {
    val interactionInverseNormal = Color("#ffffff".toColorInt())
    val interactionInverseHover = Color("#ffffffd1".toColorInt())
    val interactionInverseActive = Color("#ffffffb8".toColorInt())
    val interactionInverseSelected = Color("#ffffffd1".toColorInt())
}

object FocusValuesContainer1 {
    val interactionFocusDefault = Color("#6691f4".toColorInt())
}

object InteractionValuesContainer1 {
    val `default` = DefaultValuesContainer1
    val neutral = NeutralValuesContainer4
    val danger = DangerValuesContainer4
    val ghost = GhostValuesContainer3
    val disabled = DisabledValuesContainer1
    val border = BorderValuesContainer3
    val background = BackgroundValuesContainer3
    val inverse = InverseValuesContainer3
    val focus = FocusValuesContainer1
}

object GrayValuesContainer1 {
    val nonSemanticGrayContentPrimary = Color("#272e35".toColorInt())
    val nonSemanticGrayContentSecondary = Color("#555f6d".toColorInt())
    val nonSemanticGrayBorderDefault = Color("#eaedf0".toColorInt())
    val nonSemanticGrayBorderStrong = Color("#555f6d".toColorInt())
    val nonSemanticGrayBorderSubtle = Color("#cfd6dd".toColorInt())
    val nonSemanticGrayBackgroundStrong = Color("#555f6d".toColorInt())
    val nonSemanticGrayBackgroundMuted = Color("#dee3e7".toColorInt())
    val nonSemanticGrayBackgroundOnSubtle = Color("#eaedf0".toColorInt())
    val nonSemanticGrayBackgroundSubtle = Color("#f5f7f9".toColorInt())
    val nonSemanticGrayBackgroundSurface = Color("#fcfcfd".toColorInt())
}

object WhiteValuesContainer1 {
    val nonSemanticWhiteContentPrimary = Color("#ffffff".toColorInt())
    val nonSemanticWhiteContentSecondary = Color("#ffffffa3".toColorInt())
    val nonSemanticWhiteBorderDefault = Color("#ffffff66".toColorInt())
    val nonSemanticWhiteBorderStrong = Color("#ffffff".toColorInt())
    val nonSemanticWhiteBorderSubtle = Color("#ffffffad".toColorInt())
    val nonSemanticWhiteBackgroundStrong = Color("#ffffff".toColorInt())
    val nonSemanticWhiteBackgroundMuted = Color("#ffffffa3".toColorInt())
    val nonSemanticWhiteBackgroundOnSubtle = Color("#ffffff66".toColorInt())
    val nonSemanticWhiteBackgroundSubtle = Color("#ffffff1f".toColorInt())
    val nonSemanticWhiteBackgroundSurface = Color("#ffffff1a".toColorInt())
}

object RedValuesContainer2 {
    val nonSemanticRedContentPrimary = Color("#6f2020".toColorInt())
    val nonSemanticRedContentSecondary = Color("#c53434".toColorInt())
    val nonSemanticRedBorderDefault = Color("#fee7e7".toColorInt())
    val nonSemanticRedBorderStrong = Color("#c53434".toColorInt())
    val nonSemanticRedBorderSubtle = Color("#fccfcf".toColorInt())
    val nonSemanticRedBackgroundStrong = Color("#c53434".toColorInt())
    val nonSemanticRedBackgroundMuted = Color("#fcd9d9".toColorInt())
    val nonSemanticRedBackgroundOnSubtle = Color("#fee7e7".toColorInt())
    val nonSemanticRedBackgroundSubtle = Color("#fef5f5".toColorInt())
    val nonSemanticRedBackgroundSurface = Color("#fffafa".toColorInt())
}

object MagentaValuesContainer2 {
    val nonSemanticMagentaContentPrimary = Color("#671e4d".toColorInt())
    val nonSemanticMagentaContentSecondary = Color("#b12f86".toColorInt())
    val nonSemanticMagentaBorderDefault = Color("#fde2f4".toColorInt())
    val nonSemanticMagentaBorderStrong = Color("#b12f86".toColorInt())
    val nonSemanticMagentaBorderSubtle = Color("#f7cae8".toColorInt())
    val nonSemanticMagentaBackgroundStrong = Color("#b12f86".toColorInt())
    val nonSemanticMagentaBackgroundMuted = Color("#fbd5ee".toColorInt())
    val nonSemanticMagentaBackgroundOnSubtle = Color("#fde2f4".toColorInt())
    val nonSemanticMagentaBackgroundSubtle = Color("#fef6fb".toColorInt())
    val nonSemanticMagentaBackgroundSurface = Color("#fffafd".toColorInt())
}

object PurpleValuesContainer2 {
    val nonSemanticPurpleContentPrimary = Color("#5b1e67".toColorInt())
    val nonSemanticPurpleContentSecondary = Color("#9939ac".toColorInt())
    val nonSemanticPurpleBorderDefault = Color("#f8e2fd".toColorInt())
    val nonSemanticPurpleBorderStrong = Color("#9939ac".toColorInt())
    val nonSemanticPurpleBorderSubtle = Color("#f4caf7".toColorInt())
    val nonSemanticPurpleBackgroundStrong = Color("#9939ac".toColorInt())
    val nonSemanticPurpleBackgroundMuted = Color("#f5d5fb".toColorInt())
    val nonSemanticPurpleBackgroundOnSubtle = Color("#f8e2fd".toColorInt())
    val nonSemanticPurpleBackgroundSubtle = Color("#fdf5ff".toColorInt())
    val nonSemanticPurpleBackgroundSurface = Color("#fefaff".toColorInt())
}

object VioletValuesContainer2 {
    val nonSemanticVioletContentPrimary = Color("#39288a".toColorInt())
    val nonSemanticVioletContentSecondary = Color("#634eca".toColorInt())
    val nonSemanticVioletBorderDefault = Color("#eeebff".toColorInt())
    val nonSemanticVioletBorderStrong = Color("#634eca".toColorInt())
    val nonSemanticVioletBorderSubtle = Color("#dcd6ff".toColorInt())
    val nonSemanticVioletBackgroundStrong = Color("#634eca".toColorInt())
    val nonSemanticVioletBackgroundMuted = Color("#e3e0ff".toColorInt())
    val nonSemanticVioletBackgroundOnSubtle = Color("#eeebff".toColorInt())
    val nonSemanticVioletBackgroundSubtle = Color("#f7f5ff".toColorInt())
    val nonSemanticVioletBackgroundSurface = Color("#fbfaff".toColorInt())
}

object BlueValuesContainer2 {
    val nonSemanticBlueContentPrimary = Color("#113997".toColorInt())
    val nonSemanticBlueContentSecondary = Color("#3061d5".toColorInt())
    val nonSemanticBlueBorderDefault = Color("#e5eeff".toColorInt())
    val nonSemanticBlueBorderStrong = Color("#3061d5".toColorInt())
    val nonSemanticBlueBorderSubtle = Color("#ccdcff".toColorInt())
    val nonSemanticBlueBackgroundStrong = Color("#3061d5".toColorInt())
    val nonSemanticBlueBackgroundMuted = Color("#d6e3ff".toColorInt())
    val nonSemanticBlueBackgroundOnSubtle = Color("#e5eeff".toColorInt())
    val nonSemanticBlueBackgroundSubtle = Color("#f5f8ff".toColorInt())
    val nonSemanticBlueBackgroundSurface = Color("#fafbff".toColorInt())
}

object CyanValuesContainer2 {
    val nonSemanticCyanContentPrimary = Color("#0c456e".toColorInt())
    val nonSemanticCyanContentSecondary = Color("#0870ba".toColorInt())
    val nonSemanticCyanBorderDefault = Color("#e0f1ff".toColorInt())
    val nonSemanticCyanBorderStrong = Color("#0870ba".toColorInt())
    val nonSemanticCyanBorderSubtle = Color("#c2e2ff".toColorInt())
    val nonSemanticCyanBackgroundStrong = Color("#0870ba".toColorInt())
    val nonSemanticCyanBackgroundMuted = Color("#cce7ff".toColorInt())
    val nonSemanticCyanBackgroundOnSubtle = Color("#e0f1ff".toColorInt())
    val nonSemanticCyanBackgroundSubtle = Color("#f0f9ff".toColorInt())
    val nonSemanticCyanBackgroundSurface = Color("#fafdff".toColorInt())
}

object TealValuesContainer2 {
    val nonSemanticTealContentPrimary = Color("#0a495c".toColorInt())
    val nonSemanticTealContentSecondary = Color("#077597".toColorInt())
    val nonSemanticTealBorderDefault = Color("#e0f3fa".toColorInt())
    val nonSemanticTealBorderStrong = Color("#077597".toColorInt())
    val nonSemanticTealBorderSubtle = Color("#b8e8f5".toColorInt())
    val nonSemanticTealBackgroundStrong = Color("#077597".toColorInt())
    val nonSemanticTealBackgroundMuted = Color("#c5ecf7".toColorInt())
    val nonSemanticTealBackgroundOnSubtle = Color("#e0f3fa".toColorInt())
    val nonSemanticTealBackgroundSubtle = Color("#f0fbff".toColorInt())
    val nonSemanticTealBackgroundSurface = Color("#fafeff".toColorInt())
}

object AquamarineValuesContainer2 {
    val nonSemanticAquamarineContentPrimary = Color("#0d4a42".toColorInt())
    val nonSemanticAquamarineContentSecondary = Color("#097b68".toColorInt())
    val nonSemanticAquamarineBorderDefault = Color("#daf6f3".toColorInt())
    val nonSemanticAquamarineBorderStrong = Color("#097b68".toColorInt())
    val nonSemanticAquamarineBorderSubtle = Color("#bee9e4".toColorInt())
    val nonSemanticAquamarineBackgroundStrong = Color("#097b68".toColorInt())
    val nonSemanticAquamarineBackgroundMuted = Color("#c5f2ec".toColorInt())
    val nonSemanticAquamarineBackgroundOnSubtle = Color("#daf6f3".toColorInt())
    val nonSemanticAquamarineBackgroundSubtle = Color("#f0faf9".toColorInt())
    val nonSemanticAquamarineBackgroundSurface = Color("#fbfefe".toColorInt())
}

object GreenValuesContainer2 {
    val nonSemanticGreenContentPrimary = Color("#135315".toColorInt())
    val nonSemanticGreenContentSecondary = Color("#347434".toColorInt())
    val nonSemanticGreenBorderDefault = Color("#dff6df".toColorInt())
    val nonSemanticGreenBorderStrong = Color("#347434".toColorInt())
    val nonSemanticGreenBorderSubtle = Color("#c6ecc6".toColorInt())
    val nonSemanticGreenBackgroundStrong = Color("#347434".toColorInt())
    val nonSemanticGreenBackgroundMuted = Color("#cff2cf".toColorInt())
    val nonSemanticGreenBackgroundOnSubtle = Color("#dff6df".toColorInt())
    val nonSemanticGreenBackgroundSubtle = Color("#f4fbf4".toColorInt())
    val nonSemanticGreenBackgroundSurface = Color("#fbfefb".toColorInt())
}

object OrangeValuesContainer2 {
    val nonSemanticOrangeContentPrimary = Color("#7a4510".toColorInt())
    val nonSemanticOrangeContentSecondary = Color("#f59638".toColorInt())
    val nonSemanticOrangeBorderDefault = Color("#ffe8d1".toColorInt())
    val nonSemanticOrangeBorderStrong = Color("#f59638".toColorInt())
    val nonSemanticOrangeBorderSubtle = Color("#ffd4a8".toColorInt())
    val nonSemanticOrangeBackgroundStrong = Color("#f59638".toColorInt())
    val nonSemanticOrangeBackgroundMuted = Color("#fcdec0".toColorInt())
    val nonSemanticOrangeBackgroundOnSubtle = Color("#ffe8d1".toColorInt())
    val nonSemanticOrangeBackgroundSubtle = Color("#fff5eb".toColorInt())
    val nonSemanticOrangeBackgroundSurface = Color("#fffcfa".toColorInt())
}

object NonSemanticValuesContainer1 {
    val gray = GrayValuesContainer1
    val white = WhiteValuesContainer1
    val red = RedValuesContainer2
    val magenta = MagentaValuesContainer2
    val purple = PurpleValuesContainer2
    val violet = VioletValuesContainer2
    val blue = BlueValuesContainer2
    val cyan = CyanValuesContainer2
    val teal = TealValuesContainer2
    val aquamarine = AquamarineValuesContainer2
    val green = GreenValuesContainer2
    val orange = OrangeValuesContainer2
}

object BrandValuesContainer1 {
    val semanticBrandNegative4 = Color("#041f5d".toColorInt())
    val semanticBrandNegative3 = Color("#113997".toColorInt())
    val semanticBrandNegative2 = Color("#1e4fc2".toColorInt())
    val semanticBrandNegative1 = Color("#2759ce".toColorInt())
    val semanticBrand0 = Color("#3061d5".toColorInt())
    val semanticBrand1 = Color("#6691f4".toColorInt())
    val semanticBrand2 = Color("#8eb0fb".toColorInt())
    val semanticBrand3 = Color("#ccdcff".toColorInt())
    val semanticBrand4 = Color("#d6e3ff".toColorInt())
    val semanticBrand5 = Color("#e5eeff".toColorInt())
    val semanticBrand6 = Color("#ebf0ff".toColorInt())
    val semanticBrand7 = Color("#f5f8ff".toColorInt())
    val semanticBrand8 = Color("#fafbff".toColorInt())
}

object NeutralValuesContainer5 {
    val semanticNeutralNegative4 = Color("#1b242c".toColorInt())
    val semanticNeutralNegative3 = Color("#272e35".toColorInt())
    val semanticNeutralNegative2 = Color("#3a424a".toColorInt())
    val semanticNeutralNegative1 = Color("#4a545e".toColorInt())
    val semanticNeutral0 = Color("#555f6d".toColorInt())
    val semanticNeutral1 = Color("#7e8c9a".toColorInt())
    val semanticNeutral2 = Color("#9ea8b3".toColorInt())
    val semanticNeutral3 = Color("#cfd6dd".toColorInt())
    val semanticNeutral4 = Color("#dee3e7".toColorInt())
    val semanticNeutral5 = Color("#eaedf0".toColorInt())
    val semanticNeutral6 = Color("#f0f3f5".toColorInt())
    val semanticNeutral7 = Color("#f5f7f9".toColorInt())
    val semanticNeutral8 = Color("#fcfcfd".toColorInt())
}

object NeutralAlphaValuesContainer1 {
    val semanticNeutralANegative4 = Color("#09131aed".toColorInt())
    val semanticNeutralANegative3 = Color("#0a121ae0".toColorInt())
    val semanticNeutralANegative2 = Color("#1a232ddb".toColorInt())
    val semanticNeutralANegative1 = Color("#1d2835cc".toColorInt())
    val semanticNeutralA0 = Color("#182639bd".toColorInt())
    val semanticNeutralA1 = Color("#1830498f".toColorInt())
    val semanticNeutralA2 = Color("#0d253f66".toColorInt())
    val semanticNeutralA3 = Color("#10315633".toColorInt())
    val semanticNeutralA4 = Color("#04294321".toColorInt())
    val semanticNeutralA5 = Color("#10284717".toColorInt())
    val semanticNeutralA6 = Color("#022e500f".toColorInt())
    val semanticNeutralA7 = Color("#00295c0a".toColorInt())
    val semanticNeutralA8 = Color("#1f529e05".toColorInt())
}

object InfoValuesContainer1 {
    val semanticInfoNegative4 = Color("#041f5d".toColorInt())
    val semanticInfoNegative3 = Color("#113997".toColorInt())
    val semanticInfoNegative2 = Color("#1e4fc2".toColorInt())
    val semanticInfoNegative1 = Color("#2759ce".toColorInt())
    val semanticInfo0 = Color("#3061d5".toColorInt())
    val semanticInfo1 = Color("#6691f4".toColorInt())
    val semanticInfo2 = Color("#8eb0fb".toColorInt())
    val semanticInfo3 = Color("#ccdcff".toColorInt())
    val semanticInfo4 = Color("#d6e3ff".toColorInt())
    val semanticInfo5 = Color("#e5eeff".toColorInt())
    val semanticInfo6 = Color("#ebf0ff".toColorInt())
    val semanticInfo7 = Color("#f5f8ff".toColorInt())
    val semanticInfo8 = Color("#fafbff".toColorInt())
}

object SuccessValuesContainer3 {
    val semanticSuccessNegative4 = Color("#0a2e0b".toColorInt())
    val semanticSuccessNegative3 = Color("#135315".toColorInt())
    val semanticSuccessNegative2 = Color("#246626".toColorInt())
    val semanticSuccessNegative1 = Color("#2f6f2f".toColorInt())
    val semanticSuccess0 = Color("#347434".toColorInt())
    val semanticSuccess1 = Color("#55a555".toColorInt())
    val semanticSuccess2 = Color("#87c987".toColorInt())
    val semanticSuccess3 = Color("#c6ecc6".toColorInt())
    val semanticSuccess4 = Color("#cff2cf".toColorInt())
    val semanticSuccess5 = Color("#dff6df".toColorInt())
    val semanticSuccess6 = Color("#e6f9e6".toColorInt())
    val semanticSuccess7 = Color("#f4fbf4".toColorInt())
    val semanticSuccess8 = Color("#fbfefb".toColorInt())
}

object WarningValuesContainer1 {
    val semanticWarningNegative4 = Color("#492909".toColorInt())
    val semanticWarningNegative3 = Color("#7a4510".toColorInt())
    val semanticWarningNegative2 = Color("#a05c1c".toColorInt())
    val semanticWarningNegative1 = Color("#b4610e".toColorInt())
    val semanticWarning0 = Color("#f59638".toColorInt())
    val semanticWarning1 = Color("#f6a351".toColorInt())
    val semanticWarning2 = Color("#feb871".toColorInt())
    val semanticWarning3 = Color("#ffd4a8".toColorInt())
    val semanticWarning4 = Color("#fcdec0".toColorInt())
    val semanticWarning5 = Color("#ffe8d1".toColorInt())
    val semanticWarning6 = Color("#fff0e0".toColorInt())
    val semanticWarning7 = Color("#fff5eb".toColorInt())
    val semanticWarning8 = Color("#fffcfa".toColorInt())
}

object DangerValuesContainer5 {
    val semanticDangerNegative4 = Color("#4a0d0d".toColorInt())
    val semanticDangerNegative3 = Color("#6f2020".toColorInt())
    val semanticDangerNegative2 = Color("#952d2d".toColorInt())
    val semanticDangerNegative1 = Color("#a13636".toColorInt())
    val semanticDanger0 = Color("#c53434".toColorInt())
    val semanticDanger1 = Color("#f26363".toColorInt())
    val semanticDanger2 = Color("#f49090".toColorInt())
    val semanticDanger3 = Color("#fccfcf".toColorInt())
    val semanticDanger4 = Color("#fcd9d9".toColorInt())
    val semanticDanger5 = Color("#fee7e7".toColorInt())
    val semanticDanger6 = Color("#ffebeb".toColorInt())
    val semanticDanger7 = Color("#fef5f5".toColorInt())
    val semanticDanger8 = Color("#fffafa".toColorInt())
}

object SemanticValuesContainer1 {
    val brand = BrandValuesContainer1
    val neutral = NeutralValuesContainer5
    val neutralAlpha = NeutralAlphaValuesContainer1
    val info = InfoValuesContainer1
    val success = SuccessValuesContainer3
    val warning = WarningValuesContainer1
    val danger = DangerValuesContainer5
}

object CoolGrayValuesContainer1 {
    val negative4 = Color("#1b242c".toColorInt())
    val negative3 = Color("#272e35".toColorInt())
    val negative2 = Color("#3a424a".toColorInt())
    val negative1 = Color("#4a545e".toColorInt())
    val coolGray0 = Color("#555f6d".toColorInt())
    val coolGray1 = Color("#7e8c9a".toColorInt())
    val coolGray2 = Color("#9ea8b3".toColorInt())
    val coolGray3 = Color("#cfd6dd".toColorInt())
    val coolGray4 = Color("#dee3e7".toColorInt())
    val coolGray5 = Color("#eaedf0".toColorInt())
    val coolGray6 = Color("#f0f3f5".toColorInt())
    val coolGray7 = Color("#f5f7f9".toColorInt())
    val coolGray8 = Color("#fcfcfd".toColorInt())
}

object CoolGrayAlphaValuesContainer1 {
    val coolGrayANegative4 = Color("#09131aed".toColorInt())
    val coolGrayANegative3 = Color("#0a121ae0".toColorInt())
    val coolGrayANegative2 = Color("#1a232ddb".toColorInt())
    val coolGrayANegative1 = Color("#1d2835cc".toColorInt())
    val coolGrayA0 = Color("#182639bd".toColorInt())
    val coolGrayA1 = Color("#1830498f".toColorInt())
    val coolGrayA2 = Color("#0d253f66".toColorInt())
    val coolGrayA3 = Color("#10315633".toColorInt())
    val coolGrayA4 = Color("#04294321".toColorInt())
    val coolGrayA5 = Color("#10284717".toColorInt())
    val coolGrayA6 = Color("#022e500f".toColorInt())
    val coolGrayA7 = Color("#00295c0a".toColorInt())
    val coolGrayA8 = Color("#1f529e05".toColorInt())
}

object NeutralGrayValuesContainer1 {
    val negative4 = Color("#212121".toColorInt())
    val negative3 = Color("#2e2e2e".toColorInt())
    val negative2 = Color("#404040".toColorInt())
    val negative1 = Color("#525252".toColorInt())
    val neutralGray0 = Color("#5e5e5e".toColorInt())
    val neutralGray1 = Color("#8a8a8a".toColorInt())
    val neutralGray2 = Color("#a6a6a6".toColorInt())
    val neutralGray3 = Color("#d6d6d6".toColorInt())
    val neutralGray4 = Color("#e3e3e3".toColorInt())
    val neutralGray5 = Color("#ebebeb".toColorInt())
    val neutralGray6 = Color("#f2f2f2".toColorInt())
    val neutralGray7 = Color("#f7f7f7".toColorInt())
    val neutralGray8 = Color("#fcfcfc".toColorInt())
}

object NeutralGrayAlphaValuesContainer1 {
    val neutralGrayANegative4 = Color("#121212ed".toColorInt())
    val neutralGrayANegative3 = Color("#0f0f0fe0".toColorInt())
    val neutralGrayANegative2 = Color("#212121db".toColorInt())
    val neutralGrayANegative1 = Color("#262626cc".toColorInt())
    val neutralGrayA0 = Color("#262627bd".toColorInt())
    val neutralGrayA1 = Color("#2b2b2b8f".toColorInt())
    val neutralGrayA2 = Color("#21212166".toColorInt())
    val neutralGrayA3 = Color("#2e2e2e33".toColorInt())
    val neutralGrayA4 = Color("#1f1f1f21".toColorInt())
    val neutralGrayA5 = Color("#1c1c1c17".toColorInt())
    val neutralGrayA6 = Color("#2121210f".toColorInt())
    val neutralGrayA7 = Color("#2e2e2e0a".toColorInt())
    val neutralGrayA8 = Color("#52525205".toColorInt())
}

object WarmGrayValuesContainer1 {
    val negative4 = Color("#222220".toColorInt())
    val negative3 = Color("#30302c".toColorInt())
    val negative2 = Color("#40403a".toColorInt())
    val negative1 = Color("#52524c".toColorInt())
    val warmGray0 = Color("#5f5f58".toColorInt())
    val warmGray1 = Color("#8b8b84".toColorInt())
    val warmGray2 = Color("#a8a89f".toColorInt())
    val warmGray3 = Color("#d9d9d3".toColorInt())
    val warmGray4 = Color("#e5e5e1".toColorInt())
    val warmGray5 = Color("#eaeae6".toColorInt())
    val warmGray6 = Color("#f3f3f1".toColorInt())
    val warmGray7 = Color("#f8f8f7".toColorInt())
    val warmGray8 = Color("#fdfdfc".toColorInt())
}

object WarmGrayAlphaValuesContainer1 {
    val warmGrayANegative4 = Color("#131311ed".toColorInt())
    val warmGrayANegative3 = Color("#12120de0".toColorInt())
    val warmGrayANegative2 = Color("#22221bdb".toColorInt())
    val warmGrayANegative1 = Color("#272720cc".toColorInt())
    val warmGrayA0 = Color("#26261cbd".toColorInt())
    val warmGrayA1 = Color("#2f2f238f".toColorInt())
    val warmGrayA2 = Color("#28281166".toColorInt())
    val warmGrayA3 = Color("#3e3e1d33".toColorInt())
    val warmGrayA4 = Color("#33331421".toColorInt())
    val warmGrayA5 = Color("#22220217".toColorInt())
    val warmGrayA6 = Color("#2f2f0e0f".toColorInt())
    val warmGrayA7 = Color("#2f2f2d0a".toColorInt())
    val warmGrayA8 = Color("#52525205".toColorInt())
}

object WhiteAlphaValuesContainer1 {
    val whiteANegative12 = Color("#ffffff05".toColorInt())
    val whiteANegative11 = Color("#ffffff08".toColorInt())
    val whiteANegative10 = Color("#ffffff0d".toColorInt())
    val whiteANegative9 = Color("#ffffff14".toColorInt())
    val whiteANegative8 = Color("#ffffff1a".toColorInt())
    val whiteANegative7 = Color("#ffffff1f".toColorInt())
    val whiteANegative6 = Color("#ffffff3d".toColorInt())
    val whiteANegative5 = Color("#ffffff66".toColorInt())
    val whiteANegative4 = Color("#ffffffa3".toColorInt())
    val whiteANegative3 = Color("#ffffffad".toColorInt())
    val whiteANegative2 = Color("#ffffffb8".toColorInt())
    val whiteANegative1 = Color("#ffffffd1".toColorInt())
    val whiteA0 = Color("#ffffff".toColorInt())
}

object RedValuesContainer3 {
    val negative4 = Color("#4a0d0d".toColorInt())
    val negative3 = Color("#6f2020".toColorInt())
    val negative2 = Color("#952d2d".toColorInt())
    val negative1 = Color("#a13636".toColorInt())
    val red0 = Color("#c53434".toColorInt())
    val red1 = Color("#f26363".toColorInt())
    val red2 = Color("#f49090".toColorInt())
    val red3 = Color("#fccfcf".toColorInt())
    val red4 = Color("#fcd9d9".toColorInt())
    val red5 = Color("#fee7e7".toColorInt())
    val red6 = Color("#ffebeb".toColorInt())
    val red7 = Color("#fef5f5".toColorInt())
    val red8 = Color("#fffafa".toColorInt())
}

object MagentaValuesContainer3 {
    val negative4 = Color("#410b2f".toColorInt())
    val negative3 = Color("#671e4d".toColorInt())
    val negative2 = Color("#892969".toColorInt())
    val negative1 = Color("#953274".toColorInt())
    val magenta0 = Color("#b12f86".toColorInt())
    val magenta1 = Color("#de5eb3".toColorInt())
    val magenta2 = Color("#ec89cb".toColorInt())
    val magenta3 = Color("#f7cae8".toColorInt())
    val magenta4 = Color("#fbd5ee".toColorInt())
    val magenta5 = Color("#fde2f4".toColorInt())
    val magenta6 = Color("#fdedf8".toColorInt())
    val magenta7 = Color("#fef6fb".toColorInt())
    val magenta8 = Color("#fffafd".toColorInt())
}

object PurpleValuesContainer3 {
    val negative4 = Color("#410b2f".toColorInt())
    val negative3 = Color("#5b1e67".toColorInt())
    val negative2 = Color("#792989".toColorInt())
    val negative1 = Color("#853295".toColorInt())
    val purple0 = Color("#9939ac".toColorInt())
    val purple1 = Color("#c466db".toColorInt())
    val purple2 = Color("#d98eec".toColorInt())
    val purple3 = Color("#f4caf7".toColorInt())
    val purple4 = Color("#f5d5fb".toColorInt())
    val purple5 = Color("#f8e2fd".toColorInt())
    val purple6 = Color("#faedfd".toColorInt())
    val purple7 = Color("#fdf5ff".toColorInt())
    val purple8 = Color("#fefaff".toColorInt())
}

object VioletValuesContainer3 {
    val negative4 = Color("#201263".toColorInt())
    val negative3 = Color("#39288a".toColorInt())
    val negative2 = Color("#4e38bc".toColorInt())
    val negative1 = Color("#573fcf".toColorInt())
    val violet0 = Color("#634eca".toColorInt())
    val violet1 = Color("#927ef1".toColorInt())
    val violet2 = Color("#aba2fb".toColorInt())
    val violet3 = Color("#dcd6ff".toColorInt())
    val violet4 = Color("#e3e0ff".toColorInt())
    val violet5 = Color("#eeebff".toColorInt())
    val violet6 = Color("#f3f0ff".toColorInt())
    val violet7 = Color("#f7f5ff".toColorInt())
    val violet8 = Color("#fbfaff".toColorInt())
}

object BlueValuesContainer3 {
    val negative4 = Color("#041f5d".toColorInt())
    val negative3 = Color("#113997".toColorInt())
    val negative2 = Color("#1e4fc2".toColorInt())
    val negative1 = Color("#2759ce".toColorInt())
    val blue0 = Color("#3061d5".toColorInt())
    val blue1 = Color("#6691f4".toColorInt())
    val blue2 = Color("#8eb0fb".toColorInt())
    val blue3 = Color("#ccdcff".toColorInt())
    val blue4 = Color("#d6e3ff".toColorInt())
    val blue5 = Color("#e5eeff".toColorInt())
    val blue6 = Color("#ebf0ff".toColorInt())
    val blue7 = Color("#f5f8ff".toColorInt())
    val blue8 = Color("#fafbff".toColorInt())
}

object CyanValuesContainer3 {
    val negative4 = Color("#002742".toColorInt())
    val negative3 = Color("#0c456e".toColorInt())
    val negative2 = Color("#165c8d".toColorInt())
    val negative1 = Color("#1b679d".toColorInt())
    val cyan0 = Color("#0870ba".toColorInt())
    val cyan1 = Color("#5699dc".toColorInt())
    val cyan2 = Color("#79bcf6".toColorInt())
    val cyan3 = Color("#c2e2ff".toColorInt())
    val cyan4 = Color("#cce7ff".toColorInt())
    val cyan5 = Color("#e0f1ff".toColorInt())
    val cyan6 = Color("#ebf5ff".toColorInt())
    val cyan7 = Color("#f0f9ff".toColorInt())
    val cyan8 = Color("#fafdff".toColorInt())
}

object TealValuesContainer3 {
    val negative4 = Color("#012a37".toColorInt())
    val negative3 = Color("#0a495c".toColorInt())
    val negative2 = Color("#196076".toColorInt())
    val negative1 = Color("#196c85".toColorInt())
    val teal0 = Color("#077597".toColorInt())
    val teal1 = Color("#4f9eba".toColorInt())
    val teal2 = Color("#7ac0dc".toColorInt())
    val teal3 = Color("#b8e8f5".toColorInt())
    val teal4 = Color("#c5ecf7".toColorInt())
    val teal5 = Color("#e0f3fa".toColorInt())
    val teal6 = Color("#e8f7fc".toColorInt())
    val teal7 = Color("#f0fbff".toColorInt())
    val teal8 = Color("#fafeff".toColorInt())
}

object AquamarineValuesContainer3 {
    val negative4 = Color("#012d26".toColorInt())
    val negative3 = Color("#0d4a42".toColorInt())
    val negative2 = Color("#15665b".toColorInt())
    val negative1 = Color("#1a7061".toColorInt())
    val aquamarine0 = Color("#097b68".toColorInt())
    val aquamarine1 = Color("#3da496".toColorInt())
    val aquamarine2 = Color("#6ec9bf".toColorInt())
    val aquamarine3 = Color("#bee9e4".toColorInt())
    val aquamarine4 = Color("#c5f2ec".toColorInt())
    val aquamarine5 = Color("#daf6f3".toColorInt())
    val aquamarine6 = Color("#e2f8f5".toColorInt())
    val aquamarine7 = Color("#f0faf9".toColorInt())
    val aquamarine8 = Color("#fbfefe".toColorInt())
}

object GreenValuesContainer3 {
    val negative4 = Color("#0a2e0b".toColorInt())
    val negative3 = Color("#135315".toColorInt())
    val negative2 = Color("#246626".toColorInt())
    val negative1 = Color("#2f6f2f".toColorInt())
    val green0 = Color("#347434".toColorInt())
    val green1 = Color("#55a555".toColorInt())
    val green2 = Color("#87c987".toColorInt())
    val green3 = Color("#c6ecc6".toColorInt())
    val green4 = Color("#cff2cf".toColorInt())
    val green5 = Color("#dff6df".toColorInt())
    val green6 = Color("#e6f9e6".toColorInt())
    val green7 = Color("#f4fbf4".toColorInt())
    val green8 = Color("#fbfefb".toColorInt())
}

object OrangeValuesContainer3 {
    val negative4 = Color("#492909".toColorInt())
    val negative3 = Color("#7a4510".toColorInt())
    val negative2 = Color("#a05c1c".toColorInt())
    val negative1 = Color("#b4610e".toColorInt())
    val orange0 = Color("#f59638".toColorInt())
    val orange1 = Color("#f6a351".toColorInt())
    val orange2 = Color("#feb871".toColorInt())
    val orange3 = Color("#ffd4a8".toColorInt())
    val orange4 = Color("#fcdec0".toColorInt())
    val orange5 = Color("#ffe8d1".toColorInt())
    val orange6 = Color("#fff0e0".toColorInt())
    val orange7 = Color("#fff5eb".toColorInt())
    val orange8 = Color("#fffcfa".toColorInt())
}

object TransparentValuesContainer1 {
    val transparent = Color("#ffffff00".toColorInt())
}

object ColorValuesContainer1 {
    val content = ContentValuesContainer1
    val border = BorderValuesContainer2
    val background = BackgroundValuesContainer2
    val action = ActionValuesContainer1
    val interaction = InteractionValuesContainer1
    val nonSemantic = NonSemanticValuesContainer1
    val semantic = SemanticValuesContainer1
    val coolGray = CoolGrayValuesContainer1
    val coolGrayAlpha = CoolGrayAlphaValuesContainer1
    val neutralGray = NeutralGrayValuesContainer1
    val neutralGrayAlpha = NeutralGrayAlphaValuesContainer1
    val warmGray = WarmGrayValuesContainer1
    val warmGrayAlpha = WarmGrayAlphaValuesContainer1
    val whiteAlpha = WhiteAlphaValuesContainer1
    val red = RedValuesContainer3
    val magenta = MagentaValuesContainer3
    val purple = PurpleValuesContainer3
    val violet = VioletValuesContainer3
    val blue = BlueValuesContainer3
    val cyan = CyanValuesContainer3
    val teal = TealValuesContainer3
    val aquamarine = AquamarineValuesContainer3
    val green = GreenValuesContainer3
    val orange = OrangeValuesContainer3
    val transparent = TransparentValuesContainer1
}

object BorderWidthValuesContainer1 {
    val focus = 2.0
    val none = 0.0
    val small = 1.0
    val medium = 2.0
    val large = 4.0
    val xLarge = 8.0
    val borderWidth0 = 0.0
    val borderWidth100 = 1.0
    val borderWidth200 = 2.0
    val borderWidth400 = 4.0
    val borderWidth800 = 8.0
}

object BorderRadiusValuesContainer1 {
    val none = 0.0
    val small = 2.0
    val medium = 4.0
    val large = 8.0
    val xLarge = 12.0
    val borderRadius2xLarge = 16.0
    val borderRadius3xLarge = 20.0
    val borderRadius4xLarge = 24.0
    val full = 999.0
    val borderRadius0 = 0.0
    val borderRadius25 = 2.0
    val borderRadius50 = 4.0
    val borderRadius100 = 8.0
    val borderRadius150 = 12.0
    val borderRadius200 = 16.0
    val borderRadius250 = 20.0
    val borderRadius300 = 24.0
    val borderRadius999 = 999.0
}

object SizeValuesContainer1 {
    val size3xLarge = 72.0
    val size2xLarge = 64.0
    val xLarge = 56.0
    val large = 48.0
    val medium = 40.0
    val small = 32.0
    val xSmall = 24.0
    val size2xSmall = 20.0
    val size3xSmall = 16.0
}

object PaddingValuesContainer1 {
    val none = 0.0
    val padding2xSmall = 2.0
    val xSmall = 4.0
    val small = 8.0
    val medium = 12.0
    val large = 16.0
    val padding2xLarge = 24.0
    val padding3xLarge = 32.0
    val padding4xLarge = 40.0
    val padding5xLarge = 44.0
    val padding6xLarge = 64.0
}

object GapValuesContainer1 {
    val none = 0.0
    val gap2xSmall = 2.0
    val xSmall = 4.0
    val small = 8.0
    val medium = 12.0
    val large = 16.0
    val xLarge = 24.0
    val gap2xLarge = 32.0
    val gap3xLarge = 44.0
}

object SpaceValuesContainer1 {
    val padding = PaddingValuesContainer1
    val gap = GapValuesContainer1
}

object OpacityValuesContainer1 {
    val disabled = 0.5
    val opacity0 = 0.0
    val opacity50 = 0.5
    val opacity100 = 1.0
}

object CodeValuesContainer1 {
    val typographyCodeSmall = Typography(lineHeight = 16.0, letterSpacing = 0.0, fontWeight = 400.0, fontSize = 12.0, fontFamily = "Noto Sans Mono")
    val typographyCodeMedium = Typography(lineHeight = 20.0, letterSpacing = -0.006, fontWeight = 400.0, fontSize = 14.0, fontFamily = "Noto Sans Mono")
    val typographyCodeLarge = Typography(lineHeight = 22.0, letterSpacing = -0.011, fontWeight = 400.0, fontSize = 16.0, fontFamily = "Noto Sans Mono")
}

object UtilityValuesContainer1 {
    val typographyUtilitySmall = Typography(lineHeight = 16.0, letterSpacing = 0.0, fontWeight = 500.0, fontSize = 12.0, fontFamily = "Noto Sans")
    val typographyUtilityMedium = Typography(lineHeight = 20.0, letterSpacing = -0.006, fontWeight = 500.0, fontSize = 14.0, fontFamily = "Noto Sans")
    val typographyUtilityLarge = Typography(lineHeight = 22.0, letterSpacing = -0.011, fontWeight = 500.0, fontSize = 16.0, fontFamily = "Noto Sans")
}

object BodyValuesContainer1 {
    val typographyBodySmall = Typography(lineHeight = 16.0, letterSpacing = 0.0, fontWeight = 400.0, fontSize = 12.0, fontFamily = "Noto Sans")
    val typographyBodyMedium = Typography(lineHeight = 20.0, letterSpacing = -0.006, fontWeight = 400.0, fontSize = 14.0, fontFamily = "Noto Sans")
    val typographyBodyLarge = Typography(lineHeight = 22.0, letterSpacing = -0.011, fontWeight = 400.0, fontSize = 16.0, fontFamily = "Noto Sans")
}

object HeadingValuesContainer1 {
    val typographyHeadingSmall = Typography(lineHeight = 16.0, letterSpacing = 0.0, fontWeight = 700.0, fontSize = 12.0, fontFamily = "Noto Sans")
    val typographyHeadingMedium = Typography(lineHeight = 20.0, letterSpacing = -0.006, fontWeight = 700.0, fontSize = 14.0, fontFamily = "Noto Sans")
    val typographyHeadingLarge = Typography(lineHeight = 22.0, letterSpacing = -0.011, fontWeight = 700.0, fontSize = 16.0, fontFamily = "Noto Sans")
    val typographyHeadingXLarge = Typography(lineHeight = 24.0, letterSpacing = -0.014, fontWeight = 700.0, fontSize = 18.0, fontFamily = "Noto Sans")
    val typographyHeading2xLarge = Typography(lineHeight = 26.0, letterSpacing = -0.017, fontWeight = 700.0, fontSize = 20.0, fontFamily = "Noto Sans")
    val typographyHeading3xLarge = Typography(lineHeight = 32.0, letterSpacing = -0.019, fontWeight = 700.0, fontSize = 24.0, fontFamily = "Noto Sans")
    val typographyHeading4xLarge = Typography(lineHeight = 38.0, letterSpacing = -0.021, fontWeight = 700.0, fontSize = 28.0, fontFamily = "Noto Sans")
    val typographyHeading5xLarge = Typography(lineHeight = 42.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 32.0, fontFamily = "Noto Sans")
    val typographyHeading6xLarge = Typography(lineHeight = 48.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 36.0, fontFamily = "Noto Sans")
    val typographyHeading7xLarge = Typography(lineHeight = 56.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 42.0, fontFamily = "Noto Sans")
    val typographyHeading8xLarge = Typography(lineHeight = 58.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 48.0, fontFamily = "Noto Sans")
    val typographyHeading9xLarge = Typography(lineHeight = 66.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 54.0, fontFamily = "Noto Sans")
}

object DisplayValuesContainer1 {
    val typographyDisplaySmall = Typography(lineHeight = 66.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 54.0, fontFamily = "Noto Sans")
    val typographyDisplayMedium = Typography(lineHeight = 72.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 60.0, fontFamily = "Noto Sans")
    val typographyDisplayLarge = Typography(lineHeight = 82.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 68.0, fontFamily = "Noto Sans")
    val typographyDisplayXLarge = Typography(lineHeight = 92.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 76.0, fontFamily = "Noto Sans")
    val typographyDisplay2xLarge = Typography(lineHeight = 102.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 84.0, fontFamily = "Noto Sans")
    val typographyDisplay3xLarge = Typography(lineHeight = 112.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 92.0, fontFamily = "Noto Sans")
}

object TypographyValuesContainer1 {
    val code = CodeValuesContainer1
    val utility = UtilityValuesContainer1
    val body = BodyValuesContainer1
    val heading = HeadingValuesContainer1
    val display = DisplayValuesContainer1
}

object DimensionValuesContainer1 {
    val dimension0 = 0.0
    val dimension25 = 2.0
    val dimension50 = 4.0
    val dimension100 = 8.0
    val dimension150 = 12.0
    val dimension200 = 16.0
    val dimension250 = 20.0
    val dimension300 = 24.0
    val dimension400 = 32.0
    val dimension500 = 40.0
    val dimension550 = 44.0
    val dimension600 = 48.0
    val dimension700 = 56.0
    val dimension800 = 64.0
    val dimension900 = 72.0
    val dimension1000 = 80.0
    val dimension1200 = 96.0
    val dimension1500 = 120.0
    val dimension1600 = 128.0
}

object BottomValuesContainer1 {
    val elevationBottom100 = BoxShadow(y = 1.0, x = 0.0, type = "dropShadow", spread = 0.0, color = "#1b242c1f", blur = 2.0)
    val elevationBottom200 = listOf(BoxShadow(y = 2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c0a", blur = 2.0), BoxShadow(y = 2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c14", blur = 8.0))
    val elevationBottom300 = listOf(BoxShadow(y = 2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c0a", blur = 2.0), BoxShadow(y = 8.0, x = 0.0, type = "dropShadow", spread = -2.0, color = "#1b242c1f", blur = 16.0))
    val elevationBottom400 = listOf(BoxShadow(y = 2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c0a", blur = 2.0), BoxShadow(y = 16.0, x = 0.0, type = "dropShadow", spread = -6.0, color = "#1b242c29", blur = 24.0))
}

object TopValuesContainer1 {
    val elevationTop100 = BoxShadow(y = -1.0, x = 0.0, type = "dropShadow", spread = 0.0, color = "#1b242c1f", blur = 2.0)
    val elevationTop200 = listOf(BoxShadow(y = -2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c0a", blur = 2.0), BoxShadow(y = -2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c14", blur = 8.0))
    val elevationTop300 = listOf(BoxShadow(y = -2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c0a", blur = 2.0), BoxShadow(y = -8.0, x = 0.0, type = "dropShadow", spread = -2.0, color = "#1b242c1f", blur = 16.0))
    val elevationTop400 = listOf(BoxShadow(y = -2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c0a", blur = 2.0), BoxShadow(y = -16.0, x = 0.0, type = "dropShadow", spread = -6.0, color = "#1b242c29", blur = 24.0))
}

object ElevationValuesContainer1 {
    val bottom = BottomValuesContainer1
    val top = TopValuesContainer1
}

object FontFamilyValuesContainer1 {
    val sans = "Noto Sans"
    val serif = "Noto Serif"
    val mono = "Noto Sans Mono"
}

object FontSizeValuesContainer1 {
    val fontSize100 = 8.0
    val fontSize125 = 10.0
    val fontSize150 = 12.0
    val fontSize175 = 14.0
    val fontSize200 = 16.0
    val fontSize225 = 18.0
    val fontSize250 = 20.0
    val fontSize300 = 24.0
    val fontSize350 = 28.0
    val fontSize400 = 32.0
    val fontSize450 = 36.0
    val fontSize525 = 42.0
    val fontSize600 = 48.0
    val fontSize675 = 54.0
    val fontSize750 = 60.0
    val fontSize850 = 68.0
    val fontSize950 = 76.0
    val fontSize1050 = 84.0
    val fontSize1150 = 92.0
}

object FontWeightValuesContainer1 {
    val fontWeight300 = 300.0
    val fontWeight400 = 400.0
    val fontWeight500 = 500.0
    val fontWeight600 = 600.0
    val fontWeight700 = 700.0
}

object LetterSpacingValuesContainer1 {
    val letterSpacing0 = 0.0
    val letterSpacing100 = -0.006
    val letterSpacing200 = -0.011
    val letterSpacing300 = -0.014
    val letterSpacing400 = -0.017
    val letterSpacing500 = -0.019
    val letterSpacing600 = -0.021
    val letterSpacing700 = -0.022
}

object LineHeightValuesContainer1 {
    val value150 = 12.0
    val value200 = 16.0
    val value250 = 20.0
    val value275 = 22.0
    val value300 = 24.0
    val value325 = 26.0
    val value400 = 32.0
    val value475 = 38.0
    val value525 = 42.0
    val value600 = 48.0
    val value700 = 56.0
    val value725 = 58.0
    val value825 = 66.0
    val value900 = 72.0
    val value1025 = 82.0
    val value1150 = 92.0
    val value1275 = 102.0
    val value1400 = 112.0
}

data class Typography (
    val lineHeight: Double, 
    val letterSpacing: Double, 
    val fontWeight: Double, 
    val fontSize: Double, 
    val fontFamily: String, 
)

data class BoxShadow (
    val y: Double, 
    val x: Double, 
    val type: String, 
    val spread: Double, 
    val color: String, 
    val blur: Double, 
)