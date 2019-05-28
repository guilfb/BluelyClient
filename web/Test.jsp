<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="fr">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
    <link rel="stylesheet" href="https://unpkg.com/leaflet@1.3.1/dist/leaflet.css" />
    <script type="text/javascript" src="https://unpkg.com/leaflet@1.3.1/dist/leaflet.js"></script>
</head>

<body onload="initialize()">
<div id="map" style="width:100%; height:100%"></div>
</body>
</html>
<script type="text/javascript">
    function initialize() {
        var map = L.map('map', {
            center: [51.505, -0.09],
            zoom: 13
        }); // LIGNE 14

        var osmLayer = L.tileLayer('http://{s}.tile.osm.org/{z}/{x}/{y}.png', { // LIGNE 16
            attribution: '© OpenStreetMap contributors',
            maxZoom: 19
        });

        map.addLayer(osmLayer);
    }
</script>