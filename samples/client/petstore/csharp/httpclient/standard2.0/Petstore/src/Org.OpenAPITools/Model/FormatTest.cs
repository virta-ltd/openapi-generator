/*
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using FileParameter = Org.OpenAPITools.Client.FileParameter;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;
using OpenAPIClientUtils = Org.OpenAPITools.Client.ClientUtils;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// FormatTest
    /// </summary>
    [DataContract(Name = "format_test")]
    public partial class FormatTest : IEquatable<FormatTest>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FormatTest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected FormatTest()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="FormatTest" /> class.
        /// </summary>
        /// <param name="integer">integer.</param>
        /// <param name="int32">int32.</param>
        /// <param name="int32Range">int32Range.</param>
        /// <param name="int64Positive">int64Positive.</param>
        /// <param name="int64Negative">int64Negative.</param>
        /// <param name="int64PositiveExclusive">int64PositiveExclusive.</param>
        /// <param name="int64NegativeExclusive">int64NegativeExclusive.</param>
        /// <param name="unsignedInteger">unsignedInteger.</param>
        /// <param name="int64">int64.</param>
        /// <param name="unsignedLong">unsignedLong.</param>
        /// <param name="number">number (required).</param>
        /// <param name="varFloat">varFloat.</param>
        /// <param name="varDouble">varDouble.</param>
        /// <param name="varDecimal">varDecimal.</param>
        /// <param name="varString">varString.</param>
        /// <param name="varByte">varByte (required).</param>
        /// <param name="binary">binary.</param>
        /// <param name="date">date (required).</param>
        /// <param name="dateTime">dateTime.</param>
        /// <param name="uuid">uuid.</param>
        /// <param name="password">password (required).</param>
        /// <param name="patternWithDigits">A string that is a 10 digit number. Can have leading zeros..</param>
        /// <param name="patternWithDigitsAndDelimiter">A string starting with &#39;image_&#39; (case insensitive) and one to three digits following i.e. Image_01..</param>
        /// <param name="patternWithBackslash">None.</param>
        /// <param name="stringFormattedAsDecimal">stringFormattedAsDecimal.</param>
        /// <param name="stringFormattedAsDecimalRequired">stringFormattedAsDecimalRequired (required).</param>
        public FormatTest(int integer = default, int int32 = default, int int32Range = default, int int64Positive = default, int int64Negative = default, int int64PositiveExclusive = default, int int64NegativeExclusive = default, uint unsignedInteger = default, long int64 = default, ulong unsignedLong = default, decimal number = default, float varFloat = default, double varDouble = default, decimal varDecimal = default, string varString = default, byte[] varByte = default, FileParameter binary = default, DateTime date = default, DateTime dateTime = default, Guid uuid = default, string password = default, string patternWithDigits = default, string patternWithDigitsAndDelimiter = default, string patternWithBackslash = default, decimal stringFormattedAsDecimal = default, decimal stringFormattedAsDecimalRequired = default)
        {
            this.Number = number;
            // to ensure "varByte" is required (not null)
            if (varByte == null)
            {
                throw new ArgumentNullException("varByte is a required property for FormatTest and cannot be null");
            }
            this.Byte = varByte;
            this.Date = date;
            // to ensure "password" is required (not null)
            if (password == null)
            {
                throw new ArgumentNullException("password is a required property for FormatTest and cannot be null");
            }
            this.Password = password;
            this.StringFormattedAsDecimalRequired = stringFormattedAsDecimalRequired;
            this.Integer = integer;
            this.Int32 = int32;
            this.Int32Range = int32Range;
            this.Int64Positive = int64Positive;
            this.Int64Negative = int64Negative;
            this.Int64PositiveExclusive = int64PositiveExclusive;
            this.Int64NegativeExclusive = int64NegativeExclusive;
            this.UnsignedInteger = unsignedInteger;
            this.Int64 = int64;
            this.UnsignedLong = unsignedLong;
            this.Float = varFloat;
            this.Double = varDouble;
            this.Decimal = varDecimal;
            this.String = varString;
            this.Binary = binary;
            this.DateTime = dateTime;
            this.Uuid = uuid;
            this.PatternWithDigits = patternWithDigits;
            this.PatternWithDigitsAndDelimiter = patternWithDigitsAndDelimiter;
            this.PatternWithBackslash = patternWithBackslash;
            this.StringFormattedAsDecimal = stringFormattedAsDecimal;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Gets or Sets Integer
        /// </summary>
        [DataMember(Name = "integer", EmitDefaultValue = false)]
        public int Integer { get; set; }

        /// <summary>
        /// Gets or Sets Int32
        /// </summary>
        [DataMember(Name = "int32", EmitDefaultValue = false)]
        public int Int32 { get; set; }

        /// <summary>
        /// Gets or Sets Int32Range
        /// </summary>
        [DataMember(Name = "int32Range", EmitDefaultValue = false)]
        public int Int32Range { get; set; }

        /// <summary>
        /// Gets or Sets Int64Positive
        /// </summary>
        [DataMember(Name = "int64Positive", EmitDefaultValue = false)]
        public long Int64Positive { get; set; }

        /// <summary>
        /// Gets or Sets Int64Negative
        /// </summary>
        [DataMember(Name = "int64Negative", EmitDefaultValue = false)]
        public long Int64Negative { get; set; }

        /// <summary>
        /// Gets or Sets Int64PositiveExclusive
        /// </summary>
        [DataMember(Name = "int64PositiveExclusive", EmitDefaultValue = false)]
        public long Int64PositiveExclusive { get; set; }

        /// <summary>
        /// Gets or Sets Int64NegativeExclusive
        /// </summary>
        [DataMember(Name = "int64NegativeExclusive", EmitDefaultValue = false)]
        public long Int64NegativeExclusive { get; set; }

        /// <summary>
        /// Gets or Sets UnsignedInteger
        /// </summary>
        [DataMember(Name = "unsigned_integer", EmitDefaultValue = false)]
        public uint UnsignedInteger { get; set; }

        /// <summary>
        /// Gets or Sets Int64
        /// </summary>
        [DataMember(Name = "int64", EmitDefaultValue = false)]
        public long Int64 { get; set; }

        /// <summary>
        /// Gets or Sets UnsignedLong
        /// </summary>
        [DataMember(Name = "unsigned_long", EmitDefaultValue = false)]
        public ulong UnsignedLong { get; set; }

        /// <summary>
        /// Gets or Sets Number
        /// </summary>
        [DataMember(Name = "number", IsRequired = true, EmitDefaultValue = true)]
        public decimal Number { get; set; }

        /// <summary>
        /// Gets or Sets Float
        /// </summary>
        [DataMember(Name = "float", EmitDefaultValue = false)]
        public float Float { get; set; }

        /// <summary>
        /// Gets or Sets Double
        /// </summary>
        [DataMember(Name = "double", EmitDefaultValue = false)]
        public double Double { get; set; }

        /// <summary>
        /// Gets or Sets Decimal
        /// </summary>
        [DataMember(Name = "decimal", EmitDefaultValue = false)]
        public decimal Decimal { get; set; }

        /// <summary>
        /// Gets or Sets String
        /// </summary>
        [DataMember(Name = "string", EmitDefaultValue = false)]
        public string String { get; set; }

        /// <summary>
        /// Gets or Sets Byte
        /// </summary>
        [DataMember(Name = "byte", IsRequired = true, EmitDefaultValue = true)]
        public byte[] Byte { get; set; }

        /// <summary>
        /// Gets or Sets Binary
        /// </summary>
        [DataMember(Name = "binary", EmitDefaultValue = false)]
        public FileParameter Binary { get; set; }

        /// <summary>
        /// Gets or Sets Date
        /// </summary>
        /*
        <example>Sun Feb 02 00:00:00 UTC 2020</example>
        */
        [DataMember(Name = "date", IsRequired = true, EmitDefaultValue = true)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime Date { get; set; }

        /// <summary>
        /// Gets or Sets DateTime
        /// </summary>
        /*
        <example>2007-12-03T10:15:30+01:00</example>
        */
        [DataMember(Name = "dateTime", EmitDefaultValue = false)]
        public DateTime DateTime { get; set; }

        /// <summary>
        /// Gets or Sets Uuid
        /// </summary>
        /*
        <example>72f98069-206d-4f12-9f12-3d1e525a8e84</example>
        */
        [DataMember(Name = "uuid", EmitDefaultValue = false)]
        public Guid Uuid { get; set; }

        /// <summary>
        /// Gets or Sets Password
        /// </summary>
        [DataMember(Name = "password", IsRequired = true, EmitDefaultValue = true)]
        public string Password { get; set; }

        /// <summary>
        /// A string that is a 10 digit number. Can have leading zeros.
        /// </summary>
        /// <value>A string that is a 10 digit number. Can have leading zeros.</value>
        [DataMember(Name = "pattern_with_digits", EmitDefaultValue = false)]
        public string PatternWithDigits { get; set; }

        /// <summary>
        /// A string starting with &#39;image_&#39; (case insensitive) and one to three digits following i.e. Image_01.
        /// </summary>
        /// <value>A string starting with &#39;image_&#39; (case insensitive) and one to three digits following i.e. Image_01.</value>
        [DataMember(Name = "pattern_with_digits_and_delimiter", EmitDefaultValue = false)]
        public string PatternWithDigitsAndDelimiter { get; set; }

        /// <summary>
        /// None
        /// </summary>
        /// <value>None</value>
        [DataMember(Name = "pattern_with_backslash", EmitDefaultValue = false)]
        public string PatternWithBackslash { get; set; }

        /// <summary>
        /// Gets or Sets StringFormattedAsDecimal
        /// </summary>
        [DataMember(Name = "string_formatted_as_decimal", EmitDefaultValue = false)]
        public decimal StringFormattedAsDecimal { get; set; }

        /// <summary>
        /// Gets or Sets StringFormattedAsDecimalRequired
        /// </summary>
        [DataMember(Name = "string_formatted_as_decimal_required", IsRequired = true, EmitDefaultValue = true)]
        public decimal StringFormattedAsDecimalRequired { get; set; }

        /// <summary>
        /// Gets or Sets additional properties
        /// </summary>
        [JsonExtensionData]
        public IDictionary<string, object> AdditionalProperties { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class FormatTest {\n");
            sb.Append("  Integer: ").Append(Integer).Append("\n");
            sb.Append("  Int32: ").Append(Int32).Append("\n");
            sb.Append("  Int32Range: ").Append(Int32Range).Append("\n");
            sb.Append("  Int64Positive: ").Append(Int64Positive).Append("\n");
            sb.Append("  Int64Negative: ").Append(Int64Negative).Append("\n");
            sb.Append("  Int64PositiveExclusive: ").Append(Int64PositiveExclusive).Append("\n");
            sb.Append("  Int64NegativeExclusive: ").Append(Int64NegativeExclusive).Append("\n");
            sb.Append("  UnsignedInteger: ").Append(UnsignedInteger).Append("\n");
            sb.Append("  Int64: ").Append(Int64).Append("\n");
            sb.Append("  UnsignedLong: ").Append(UnsignedLong).Append("\n");
            sb.Append("  Number: ").Append(Number).Append("\n");
            sb.Append("  Float: ").Append(Float).Append("\n");
            sb.Append("  Double: ").Append(Double).Append("\n");
            sb.Append("  Decimal: ").Append(Decimal).Append("\n");
            sb.Append("  String: ").Append(String).Append("\n");
            sb.Append("  Byte: ").Append(Byte).Append("\n");
            sb.Append("  Binary: ").Append(Binary).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  DateTime: ").Append(DateTime).Append("\n");
            sb.Append("  Uuid: ").Append(Uuid).Append("\n");
            sb.Append("  Password: ").Append(Password).Append("\n");
            sb.Append("  PatternWithDigits: ").Append(PatternWithDigits).Append("\n");
            sb.Append("  PatternWithDigitsAndDelimiter: ").Append(PatternWithDigitsAndDelimiter).Append("\n");
            sb.Append("  PatternWithBackslash: ").Append(PatternWithBackslash).Append("\n");
            sb.Append("  StringFormattedAsDecimal: ").Append(StringFormattedAsDecimal).Append("\n");
            sb.Append("  StringFormattedAsDecimalRequired: ").Append(StringFormattedAsDecimalRequired).Append("\n");
            sb.Append("  AdditionalProperties: ").Append(AdditionalProperties).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return OpenAPIClientUtils.compareLogic.Compare(this, input as FormatTest).AreEqual;
        }

        /// <summary>
        /// Returns true if FormatTest instances are equal
        /// </summary>
        /// <param name="input">Instance of FormatTest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FormatTest input)
        {
            return OpenAPIClientUtils.compareLogic.Compare(this, input).AreEqual;
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                hashCode = (hashCode * 59) + this.Integer.GetHashCode();
                hashCode = (hashCode * 59) + this.Int32.GetHashCode();
                hashCode = (hashCode * 59) + this.Int32Range.GetHashCode();
                hashCode = (hashCode * 59) + this.Int64Positive.GetHashCode();
                hashCode = (hashCode * 59) + this.Int64Negative.GetHashCode();
                hashCode = (hashCode * 59) + this.Int64PositiveExclusive.GetHashCode();
                hashCode = (hashCode * 59) + this.Int64NegativeExclusive.GetHashCode();
                hashCode = (hashCode * 59) + this.UnsignedInteger.GetHashCode();
                hashCode = (hashCode * 59) + this.Int64.GetHashCode();
                hashCode = (hashCode * 59) + this.UnsignedLong.GetHashCode();
                hashCode = (hashCode * 59) + this.Number.GetHashCode();
                hashCode = (hashCode * 59) + this.Float.GetHashCode();
                hashCode = (hashCode * 59) + this.Double.GetHashCode();
                hashCode = (hashCode * 59) + this.Decimal.GetHashCode();
                if (this.String != null)
                {
                    hashCode = (hashCode * 59) + this.String.GetHashCode();
                }
                if (this.Byte != null)
                {
                    hashCode = (hashCode * 59) + this.Byte.GetHashCode();
                }
                if (this.Binary != null)
                {
                    hashCode = (hashCode * 59) + this.Binary.GetHashCode();
                }
                if (this.Date != null)
                {
                    hashCode = (hashCode * 59) + this.Date.GetHashCode();
                }
                if (this.DateTime != null)
                {
                    hashCode = (hashCode * 59) + this.DateTime.GetHashCode();
                }
                if (this.Uuid != null)
                {
                    hashCode = (hashCode * 59) + this.Uuid.GetHashCode();
                }
                if (this.Password != null)
                {
                    hashCode = (hashCode * 59) + this.Password.GetHashCode();
                }
                if (this.PatternWithDigits != null)
                {
                    hashCode = (hashCode * 59) + this.PatternWithDigits.GetHashCode();
                }
                if (this.PatternWithDigitsAndDelimiter != null)
                {
                    hashCode = (hashCode * 59) + this.PatternWithDigitsAndDelimiter.GetHashCode();
                }
                if (this.PatternWithBackslash != null)
                {
                    hashCode = (hashCode * 59) + this.PatternWithBackslash.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.StringFormattedAsDecimal.GetHashCode();
                hashCode = (hashCode * 59) + this.StringFormattedAsDecimalRequired.GetHashCode();
                if (this.AdditionalProperties != null)
                {
                    hashCode = (hashCode * 59) + this.AdditionalProperties.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            // Integer (int) maximum
            if (this.Integer > (int)100)
            {
                yield return new ValidationResult("Invalid value for Integer, must be a value less than or equal to 100.", new [] { "Integer" });
            }

            // Integer (int) minimum
            if (this.Integer < (int)10)
            {
                yield return new ValidationResult("Invalid value for Integer, must be a value greater than or equal to 10.", new [] { "Integer" });
            }

            // Int32 (int) maximum
            if (this.Int32 > (int)200)
            {
                yield return new ValidationResult("Invalid value for Int32, must be a value less than or equal to 200.", new [] { "Int32" });
            }

            // Int32 (int) minimum
            if (this.Int32 < (int)20)
            {
                yield return new ValidationResult("Invalid value for Int32, must be a value greater than or equal to 20.", new [] { "Int32" });
            }

            // Int32Range (int) maximum
            if (this.Int32Range > (int)2147483647)
            {
                yield return new ValidationResult("Invalid value for Int32Range, must be a value less than or equal to 2147483647.", new [] { "Int32Range" });
            }

            // Int32Range (int) minimum
            if (this.Int32Range < (int)-2147483648)
            {
                yield return new ValidationResult("Invalid value for Int32Range, must be a value greater than or equal to -2147483648.", new [] { "Int32Range" });
            }

            // Int64Positive (long) minimum
            if (this.Int64Positive < (long)2147483648)
            {
                yield return new ValidationResult("Invalid value for Int64Positive, must be a value greater than or equal to 2147483648.", new [] { "Int64Positive" });
            }

            // Int64Negative (long) maximum
            if (this.Int64Negative > (long)-2147483649)
            {
                yield return new ValidationResult("Invalid value for Int64Negative, must be a value less than or equal to -2147483649.", new [] { "Int64Negative" });
            }

            // Int64PositiveExclusive (long) minimum
            if (this.Int64PositiveExclusive < (long)2147483647)
            {
                yield return new ValidationResult("Invalid value for Int64PositiveExclusive, must be a value greater than 2147483647.", new [] { "Int64PositiveExclusive" });
            }

            // Int64NegativeExclusive (long) maximum
            if (this.Int64NegativeExclusive <= (long)-2147483648)
            {
                yield return new ValidationResult("Invalid value for Int64NegativeExclusive, must be a value less than -2147483648.", new [] { "Int64NegativeExclusive" });
            }

            // UnsignedInteger (uint) maximum
            if (this.UnsignedInteger > (uint)200)
            {
                yield return new ValidationResult("Invalid value for UnsignedInteger, must be a value less than or equal to 200.", new [] { "UnsignedInteger" });
            }

            // UnsignedInteger (uint) minimum
            if (this.UnsignedInteger < (uint)20)
            {
                yield return new ValidationResult("Invalid value for UnsignedInteger, must be a value greater than or equal to 20.", new [] { "UnsignedInteger" });
            }

            // Number (decimal) maximum
            if (this.Number > (decimal)543.2)
            {
                yield return new ValidationResult("Invalid value for Number, must be a value less than or equal to 543.2.", new [] { "Number" });
            }

            // Number (decimal) minimum
            if (this.Number < (decimal)32.1)
            {
                yield return new ValidationResult("Invalid value for Number, must be a value greater than or equal to 32.1.", new [] { "Number" });
            }

            // Float (float) maximum
            if (this.Float > (float)987.6)
            {
                yield return new ValidationResult("Invalid value for Float, must be a value less than or equal to 987.6.", new [] { "Float" });
            }

            // Float (float) minimum
            if (this.Float < (float)54.3)
            {
                yield return new ValidationResult("Invalid value for Float, must be a value greater than or equal to 54.3.", new [] { "Float" });
            }

            // Double (double) maximum
            if (this.Double > (double)123.4)
            {
                yield return new ValidationResult("Invalid value for Double, must be a value less than or equal to 123.4.", new [] { "Double" });
            }

            // Double (double) minimum
            if (this.Double < (double)67.8)
            {
                yield return new ValidationResult("Invalid value for Double, must be a value greater than or equal to 67.8.", new [] { "Double" });
            }

            if (this.String != null) {
                // String (string) pattern
                Regex regexString = new Regex(@"[a-z]", RegexOptions.CultureInvariant | RegexOptions.IgnoreCase);
                if (!regexString.Match(this.String).Success)
                {
                    yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for String, must match a pattern of " + regexString, new [] { "String" });
                }
            }

            // Password (string) maxLength
            if (this.Password != null && this.Password.Length > 64)
            {
                yield return new ValidationResult("Invalid value for Password, length must be less than 64.", new [] { "Password" });
            }

            // Password (string) minLength
            if (this.Password != null && this.Password.Length < 10)
            {
                yield return new ValidationResult("Invalid value for Password, length must be greater than 10.", new [] { "Password" });
            }

            if (this.PatternWithDigits != null) {
                // PatternWithDigits (string) pattern
                Regex regexPatternWithDigits = new Regex(@"^\d{10}$", RegexOptions.CultureInvariant);
                if (!regexPatternWithDigits.Match(this.PatternWithDigits).Success)
                {
                    yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for PatternWithDigits, must match a pattern of " + regexPatternWithDigits, new [] { "PatternWithDigits" });
                }
            }

            if (this.PatternWithDigitsAndDelimiter != null) {
                // PatternWithDigitsAndDelimiter (string) pattern
                Regex regexPatternWithDigitsAndDelimiter = new Regex(@"^image_\d{1,3}$", RegexOptions.CultureInvariant | RegexOptions.IgnoreCase);
                if (!regexPatternWithDigitsAndDelimiter.Match(this.PatternWithDigitsAndDelimiter).Success)
                {
                    yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for PatternWithDigitsAndDelimiter, must match a pattern of " + regexPatternWithDigitsAndDelimiter, new [] { "PatternWithDigitsAndDelimiter" });
                }
            }

            if (this.PatternWithBackslash != null) {
                // PatternWithBackslash (string) pattern
                Regex regexPatternWithBackslash = new Regex(@"^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\/([0-9]|[1-2][0-9]|3[0-2]))$", RegexOptions.CultureInvariant);
                if (!regexPatternWithBackslash.Match(this.PatternWithBackslash).Success)
                {
                    yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for PatternWithBackslash, must match a pattern of " + regexPatternWithBackslash, new [] { "PatternWithBackslash" });
                }
            }

            yield break;
        }
    }

}
