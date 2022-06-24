<script>
export default {
  props: {
    headers: Array,
    data: Array
  }
}
</script>

<template>
    <table>
        <tr>
            <th v-for="(header, index) in headers" :key="index">{{header}}</th>
        </tr>
        <tr v-for="(row, i) in data" :key="i">
            <td v-for="(cell, j) in row" :key="j">
            {{cell}}
            </td>
        </tr>
    </table>
</template>

<style>
    table, th, td {
        border: 2px solid;
        padding: 5px;
    }
    th, td {
        padding: 2px;
    }
    table {
        border-collapse: collapse;
    }
</style>