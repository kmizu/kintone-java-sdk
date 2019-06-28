# Lookup

Get a list of fields and their settings.

>
- Permissions to view the App is needed.
- API Tokens cannot be used with this API.

## LookupField

!!! warning
    - extend the abstract class  "[AbstractInputField](../form-fields-input/#abstractinputfield)"

### Methods

#### getLookup()

> Get the lookup

**Parameter**

(none)

**Return**

[LookupItem](#lookupitem)

**Sample code**

<details class="tab-container" open>
<Summary>get Lookup</Summary>

<strong class="tab-name">Source code</strong>

<pre class="inline-code">
LookupItem lookup = lookupField.getLookup();
</pre>

</details>

## LookupItem

### Methods

#### getFieldMapping()

> Get the fieldMapping

**Parameter**

(none)

**Return**

List<[FieldMapping](../form-fields/#fieldmapping)\>

**Sample code**

<details class="tab-container" open>
<Summary>get Field Mapping</Summary>

<strong class="tab-name">Source code</strong>

<pre class="inline-code">
List<FieldMapping> fieldMapping = lookupItem.getFieldMapping();
</pre>

</details>

#### getFilterCond()

> Get the filterCond

**Parameter**

(none)

**Return**

String

**Sample code**

<details class="tab-container" open>
<Summary>get Filter Cond</Summary>

<strong class="tab-name">Source code</strong>

<pre class="inline-code">
String filterCond = lookupItem.getFilterCond();
</pre>

</details>

#### getLookupPickerFields()

> Get the lookupPickerFields

**Parameter**

(none)

**Return**

List<String\>

**Sample code**

<details class="tab-container" open>
<Summary>get Lookup Picker Fields</Summary>

<strong class="tab-name">Source code</strong>

<pre class="inline-code">
List<String> lookupPickerFields = lookupItem.getLookupPickerFields();
</pre>

</details>

#### getRelatedApp()

> Get the relatedApp

**Parameter**

(none)

**Return**

[RelatedApp](../form-fields-related_record/#relatedapp)

**Sample code**

<details class="tab-container" open>
<Summary>get Related App</Summary>

<strong class="tab-name">Source code</strong>

<pre class="inline-code">
RelatedApp relatedApp = lookupItem.getRelatedApp();
</pre>

</details>

#### getRelatedKeyField()

> Get the relatedKeyField

**Parameter**

(none)

**Return**

String

**Sample code**

<details class="tab-container" open>
<Summary>get Related App</Summary>

<strong class="tab-name">Source code</strong>

<pre class="inline-code">
String relatedKeyField = lookupItem.getRelatedKeyField();
</pre>

</details>

#### getSort()

> Get the sort

**Parameter**

(none)

**Return**

String

**Sample code**

<details class="tab-container" open>
<Summary>get Sort</Summary>

<strong class="tab-name">Source code</strong>

<pre class="inline-code">
String sort = lookupItem.getSort();
</pre>

</details>

## Reference

- [Get App](https://developer.kintone.io/hc/en-us/articles/212494888)`on developer network`
- [Get Apps](https://developer.kintone.io/hc/en-us/articles/115005336727)`on developer network`
- [Get Form fields](https://developer.kintone.io/hc/en-us/articles/115005509288)`on developer network`
- [Get Form Layout](https://developer.kintone.io/hc/en-us/articles/115005509068)`on developer network`